import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class FooBarQix {

  private static final LinkedHashMap<Integer, String> mapOfValues =
      new LinkedHashMap() {{
        put(3, "Foo");
        put(5, "Bar");
        put(7, "Qix");
      }};

  public String compute(String number) {

    var result = new StringBuilder();
    var formatNumber = Integer.valueOf(number);

    mapOfValues.entrySet().stream()
        .filter(entry -> isDivideBy(formatNumber, entry.getKey()))
        .map(Entry::getValue)
        .forEach(result::append);

    // fast path
    var containsOneOfKeyValue = mapOfValues.keySet().stream()
        .map(String::valueOf)
        .anyMatch(number::contains);

    if (containsOneOfKeyValue) {
      number.chars()
          .map(Character::getNumericValue)
          .filter(mapOfValues::containsKey)
          .mapToObj(mapOfValues::get)
          .forEach(result::append);
    }

    if (result.length() == 0) {
      result.append(number);
    }

    return result.toString();
  }

  private boolean isDivideBy(Integer formatNumber, Integer key) {
    return formatNumber % key == 0;
  }
}
