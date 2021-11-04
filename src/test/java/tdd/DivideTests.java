package tdd;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.Assert.assertEquals;

/**
 * How unit test helps
 * 1. Help us to run the single class separately.
 * 2. Help us to test corner cases
 * 3. Help us to catch silly mistakes
 */

public class DivideTests {
    private Divide divide;

    @Before
    public void setup() {
        this.divide = new Divide();
    }

    @Test
    public void divideFn_whenCorrectInput_divideResult() {
        final double numerator = 10;
        final double denomenator = 5;
        assertEquals(2, (int)this.divide.divideFn(numerator, denomenator));
    }

    @Test
    public void divideFn_whenDivideByZero_throwException() {
        final double numerator = 10;
        final double zeroDenomenator = 0;
        final Exception exception =
                Assertions.assertThrows(RuntimeException.class, () -> this.divide.divideFn(numerator, zeroDenomenator));
        assertEquals(exception.getMessage(), "divide by zero");
    }
}
