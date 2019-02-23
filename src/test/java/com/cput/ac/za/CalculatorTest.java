package com.cput.ac.za;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void add()
    {
        //Precondition
        ApplicationContext alias = new AnnotationConfigApplicationContext(SpringClass.class);
        CalculatorInterface calcInterface = (CalculatorInterface) alias.getBean("Typical");

       //Test
       int result = calcInterface.add(4, 4);
        Assert.assertEquals(9, result);
    }
}