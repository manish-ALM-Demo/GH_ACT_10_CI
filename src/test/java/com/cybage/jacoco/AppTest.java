package com.cybage.jacoco;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import org.junit.Test;


/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
      @Test
    public void testAddition() {
        assertEquals(10.0, Calculator.add(5.0, 5.0), 0.0001);
    }

    @Test
    public void testSubtraction() {
        assertEquals(5.0, Calculator.subtract(10.0, 5.0), 0.0001);
    }

    @Test
    public void testMultiplication() {
        assertEquals(25.0, Calculator.multiply(5.0, 5.0), 0.0001);
    }

    @Test
    public void testDivision() {
        assertEquals(2.0, Calculator.divide(10.0, 5.0), 0.0001);
    }

    @Test(expected = ArithmeticException.class)
    public void testDivisionByZero() {
        Calculator.divide(10.0, 0.0);
    }
}
