import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void before() {
        calculator = new Calculator(59, 32, 92.5, 19.7);
    }

    @Test
    public void hasNum1(){
        assertEquals(59, calculator.getNum1());
    }

    @Test
    public void hasNum2(){
        assertEquals(32, calculator.getNum2());
    }

    @Test
    public void hasNum3(){
        assertEquals(92.5, calculator.getNum3(), 0.0);
    }

    @Test
    public void hasNum4(){
        assertEquals(19.7, calculator.getNum4(), 0.0);
    }

    @Test
    public void checkAddNum1Num2(){
        assertEquals(91, calculator.add());
    }

    @Test
    public void checkSubstractNum1Num2(){
        assertEquals(27, calculator.subtract());
    }

    @Test
    public void checkMultiplyNum1Num2(){
        assertEquals(1888, calculator.multiply());
    }

    @Test
    public void checkDivideNum3Num4(){
        assertEquals(4.6954314, calculator.divide(), 0.01);
    }
}
