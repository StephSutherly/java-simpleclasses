import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void before() {
        calculator = new Calculator(20.22, 3.00);
    }

    @Test
    public void canAdd() {
        assertEquals(23.22, calculator.addNums(), 0.01);
    }

    @Test
    public void canSubtract() {
        assertEquals(17.22, calculator.subtractNums(), 0.01);
    }

    @Test
    public void canMultiply() {
        assertEquals(60.66, calculator.multiplyNums(), 0.01);
    }

    @Test
    public void canDivide() {
        assertEquals(6.74, calculator.divideNums(), 0.01);
    }
}


