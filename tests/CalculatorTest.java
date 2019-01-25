import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
    private Calculator calc = new Calculator();
    @Test
    public void sum() {
        int x = 2, y =2;
        int sum = x + y;

        assertEquals(4, sum);
    }

    @Test
    public void subtractNum() {
        int x = 2, y =2;
        int sum = x - y;

        assertEquals(0, sum);
    }

    @Test
    public void multiplyNum() {
        int x = 2, y =2;
        int sum = 2 * 2;

        assertEquals(4, sum);
    }

    @Test
    public void divideNum() {
        int x = 2, y =1;
        int sum = x / y;

        assertEquals(2, sum);
    }
}