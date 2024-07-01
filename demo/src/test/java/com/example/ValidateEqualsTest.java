package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ValidateEqualsTest {
    @Test
    public void success(){
        String result = "Registro salvo com sucesso!";
        assertEquals("Registro salvo com sucesso!", result);
    }
    
}
