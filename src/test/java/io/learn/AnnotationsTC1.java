package io.learn;

import org.testng.annotations.*;

public class AnnotationsTC1 {

    @Test
    void testmethod1()
    {
        System.out.println("This is the first test");
    }

    @Test
    void testmethod2()
    {
        System.out.println("This the second Test");
    }

    @BeforeMethod
    void beforemethod()
    {
        System.out.println("Run before method");
    }

    @AfterMethod
    void aftermethod()
    {
        System.out.println("Run after method");
    }
    @BeforeClass

    void beforeclass()
    {
        System.out.println("Excute before class");
    }

    @AfterClass
    void afterclass()
    {
        System.out.println("Excute after class");
    }

}