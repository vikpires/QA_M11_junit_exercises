package com.example;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class ValidateTrueFalse {
    @Test
    public void True(){
        boolean fieldIsPresent = true;
        assertTrue(fieldIsPresent);
    }
    @Test
    public void False(){
        boolean fieldIsPresent = false;
        assertFalse(fieldIsPresent);
    }
    
}
