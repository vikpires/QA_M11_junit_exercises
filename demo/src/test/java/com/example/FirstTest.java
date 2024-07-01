package com.example;
import org.junit.jupiter.api.Test;

public class FirstTest {
    
    @Test
    public void test01(){
        System.out.println("Teste 1 executado");
    } 
    
    public void test02(){
        System.out.println("Teste 2 não executado");
    }

    @Test
    public void test03(){
        System.out.println("Teste 3 executado");
    }
    
}
