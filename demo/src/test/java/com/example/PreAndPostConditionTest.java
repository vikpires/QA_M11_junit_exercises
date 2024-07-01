package com.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PreAndPostConditionTest {
    @BeforeEach
    public void preCondition(){
        System.out.println("Pre condicao");
    }
    @Test
    public void method01(){
        System.out.println("Metodo 1");
    }
    @Test
    public void method02(){
        System.out.println("Metodo 2");
    }
    @AfterEach
    public void postCondition(){
        System.out.println("Pos condicao");
    }

    
}
