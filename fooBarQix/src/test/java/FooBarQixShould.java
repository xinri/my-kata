import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
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

  @DisplayName("FooBarQix")
  @ParameterizedTest(name = "return {0} when compute with {1}")
  @CsvSource({"3, FooFoo", "5, BarBar", "7, QixQix", "9, Foo"})
  public void test_with_other_value(String value, String expectedResult) {
    // given
    var fooBarQix = new FooBarQix();

    // when
    var result = fooBarQix.compute(value);

    // then
    assertThat(result).isEqualTo(expectedResult);
  }
}
