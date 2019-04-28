package pl.edu.agh.mwo.calculator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import pl.edu.agh.mwo.calculator.Calculator.*;

import org.junit.Test;


/**
 * Unit test for simple Calculator.
 */
public class CalculatorTest
{
    /**
     * Rigorous Test :-)
     */
    Calculator calc = new Calculator();
    @Test
    public void correctSum() {
        assertEquals(10, calc.sum(4,5));
    }

    @Test
    public void correctSub() {
        assertEquals(3, calc.sub(7,4));
    }

    @Test
    public void correctMult() {
        assertEquals(12, calc.mult(3,4));
    }

    @Test
    public void correctDiv() {
        assertEquals(5, calc.div(15,3));
    }

    @Test
    public void correctAvg() {
        assertEquals(10, calc.avg(10,12));
    }
}
