package com.ust.app;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.DisabledOnOs;
import org.junit.jupiter.api.condition.EnabledForJreRange;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.api.condition.OS;

public class CalculatorTest {
    Calculator calc;

    @BeforeAll
    public static void init(){
        System.out.println("Test Begins");
    }

    @AfterAll
    public static void complete(){
        System.out.println("Test Completed");
    }

    @BeforeEach
    void setUp(){
        calc = new Calculator();
        System.out.println("New instance of Calculator Initialized");
    }

    @AfterEach
    void tearDown(){
       calc = null;
       System.out.println("Calc is set to null");
    }

    @Test
    @EnabledForJreRange(min = JRE.JAVA_22)
    @DisabledOnOs(OS.WINDOWS)
    void testAdd(){
       Assertions.assertEquals(25, calc.add(10,15));
       Assertions.assertEquals(6, calc.add(10,-4));
       Assertions.assertEquals(-5, calc.add(-2,-3));
    }

    @Test
    void testSubtract(){
        Assertions.assertEquals(5, calc.subtract(10,5));
        Assertions.assertEquals(15, calc.subtract(10,-5));
        Assertions.assertEquals(-5, calc.subtract(-10,-5));
    }

    @Test
    void testMultiply(){
        Assertions.assertEquals(25, calc.multiply(5,5));
        Assertions.assertEquals(-10, calc.multiply(5,-2));
        Assertions.assertEquals(15, calc.multiply(-5,-3));
    }

    @Test
    void testDivide(){
        Assertions.assertEquals(0, calc.divide(10,15));
        Assertions.assertEquals(3, calc.divide(15,5));
        Assertions.assertThrows(ArithmeticException.class,()->calc.divide((int)(Math.random()*10),0));
    }


}
