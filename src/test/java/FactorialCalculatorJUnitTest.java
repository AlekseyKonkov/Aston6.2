import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FactorialCalculatorJUnitTest {

    @Test
    void testFactorialPositive() {
        assertEquals(120, FactorialCalculator.factorial(5));
        assertEquals(1, FactorialCalculator.factorial(0));
    }

    @Test
    void testFactorialNegative() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            FactorialCalculator.factorial(-1);
        });
        assertEquals("Number must be non-negative", exception.getMessage());
    }
}

