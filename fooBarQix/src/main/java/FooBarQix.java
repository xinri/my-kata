import java.util.HashMap;
import java.util.Map;

public class FooBarQix {

  private static final Map<Integer, String> mapOfValues = new HashMap<>() {{
    put(3, "Foo");
    put(5, "Bar");
    put(7, "Qix");
  }};

  public String compute(String number) {

    var result = new StringBuilder();
    var formatNumber = Integer.valueOf(number);

    mapOfValues.forEach((key, value) -> {
      if (isDivideBy(formatNumber, key) || stringContains(number, key)) {
        result.append(value);
      }
    });

    if (result.length() == 0) {
      result.append(number);
    }

    return result.toString();
  }

  private boolean stringContains(String number, Integer key) {
    return number.contains(String.valueOf(key));
  }

  private boolean isDivideBy(Integer formatNumber, Integer key) {
    return formatNumber % key == 0;
  }
}
