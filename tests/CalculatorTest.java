import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
    private Calculator calc = new Calculator();
    @Test
    public void ShouldGetSumTest() {
        int x = 2, y =2;
        int sumAns = x + y;

        assertEquals(4, sumAns);
    }

    @Test
    public void ShouldGetDifferenceTest() {
        int x = 2, y =2;
        int differenceAns = x - y;

        assertEquals(0, differenceAns);
    }

    @Test
    public void ShouldGetProductTest() {
        int x = 2, y =2;
        int productAns = 2 * 2;

        assertEquals(4, productAns);
    }

    @Test
    public void ShouldGetQuotientTest() {
        int x = 2, y =1;
        int quotientAns = x / y;

        assertEquals(2, quotientAns);
    }
}

//subtractNum  --> 'difference'
//multiplyNum  --> 'product'
//divideNum    --> 'quotient'