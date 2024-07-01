package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculatorTest {

    Calculator calculate = new Calculator();

    @Test
    public void calculateSum(){
        assertEquals(4, calculate.sum(2,2));
    }
    @Test
    public void calculateSubtract(){
        assertEquals(2, calculate.subtract(4,2));
    }
    @Test
    public void calculateDivide(){
        assertEquals(3, calculate.divide(6,2));
    }
    @Test
    public void calculateMultiply(){
        assertEquals(8, calculate.multiply(4,2));
    }
    
}
