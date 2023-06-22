package calc;

import org.junit.Assert;
import org.junit.Test;

public class CalculadoraTest {
    private Calculadora calculator = new Calculadora();

    @Test
    public void testSum() {
        int result = calculator.sum(2, 3);
        Assert.assertEquals(5, result);
    }

    @Test
    public void testSubtract() {
        int result = calculator.subtract(5, 2);
        Assert.assertEquals(3, result);
    }

    @Test
    public void testMultiply() {
        int result = calculator.multiply(4, 3);
        Assert.assertEquals(12, result);
    }

    @Test
    public void testDivide() {
        double result = calculator.divide(10, 2);
        Assert.assertEquals(5.0, result, 0.0001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivideByZero() {
        calculator.divide(10, 0);
    }
}


