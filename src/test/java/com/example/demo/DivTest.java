package com.example.demo;

import static org.junit.Assert.*;

import org.junit.Test;

public class DivTest {

    @Test
    public void shouldThowException2() {
        
    }
    @Test
    public void shouldThrowDividByZeroException() {
        Div div = new Div();
        try {
            div.process(1, 0);
            fail("Should not be here!");
            
        }catch(ArithmeticException e) {
            
        }
    }

}
