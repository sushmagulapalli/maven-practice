package io.learn;

import org.testng.annotations.*;

public class AnnotationsTC2 {


    @Test
    void testmethod3()
    {
        System.out.println("This is the Third test");
    }

    @Test
    void testmethod4()
    {
        System.out.println("This the fourth Test");
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
