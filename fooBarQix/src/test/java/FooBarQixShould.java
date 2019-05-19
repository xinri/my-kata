import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

@DisplayName("Foo bar qix should")
public class FooBarQixShould {

  @DisplayName("for normal value {0}")
  @ParameterizedTest(name = "return {0} when compute with {0}")
  @ValueSource(strings = {"1", "2", "4", "8"})
  public void test_with_normal_value(String value) {
    // given
    var fooBarQix = new FooBarQix();

    // when
    var result = fooBarQix.compute(value);

    // then
    assertThat(result).isEqualTo(value);
  }

  @DisplayName("for specific values that display either Foo, Bar or Qix")
  @ParameterizedTest(name = "return {0} when compute with {1}")
  @CsvSource({"3, FooFoo", "5, BarBar", "7, QixQix", "9, Foo", "10, Bar", "13, Foo",
      "15, FooBarBar", "21, FooQix", "33, FooFooFoo"})
  public void test_with_other_value(String value, String expectedResult) {
    // given
    var fooBarQix = new FooBarQix();

    // when
    var result = fooBarQix.compute(value);

    // then
    assertThat(result).isEqualTo(expectedResult);
  }
}
