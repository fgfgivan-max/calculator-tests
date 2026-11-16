import org.example.calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    @Test
    void testAdd() {
        calculator calculator = new calculator();
        assertEquals(5, calculator.add(2, 3), "2 + 3 should equal 5");
    }

    @Test
    void testSubtract() {
        calculator calculator = new calculator();
        assertEquals(1, calculator.subtract(3, 2), "3 - 2 should equal 1");
    }
    @Test
    void testmultiply() {
        calculator calculator = new calculator();
        assertEquals(6, calculator.multiply(2, 3), "2 * 3 should equal 6");
    }

    @Test
    void testdivide() {
        calculator calculator = new calculator();
        assertEquals(1, calculator.divide(3, 3), "3 / 3 should equal 1");
    }
    @Test
    void testdivide2() {
        calculator calculator = new calculator();
        assertEquals(3, calculator.divide(3, 1), "3 / 3 should equal 1");
    }
}
