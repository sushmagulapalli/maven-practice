package io.learn.HomeTasks;

import org.testng.annotations.*;
/*TestNG Annotations: Write a simple program using all the TestNG annotations*/
//Explain the sequence of execution of these annotations//
public class AnnotationsTC {

    @BeforeSuite
    public void beforeSuite()
    {
        System.out.println("Run Before Suite");
    }

    @BeforeTest
    public void beforeTest()
    {
        System.out.println("Run before test");
    }

    @BeforeClass
    public void beforeClass()
    {
        System.out.println("Run before class");
    }


    @BeforeMethod
    public void beforeMethod()
    {
        System.out.println("Run before method");
    }

    @Test
    public void setup()
    {
        System.out.println("Set up the main page");
    }

    @AfterMethod
    public void afterMethod()
    {
        System.out.println("RUn after method");
    }

    @AfterClass
    public void afterClass()
    {
        System.out.println("run after class");
    }

    @AfterTest
    public void afterTest()
    {
        System.out.println("Run after test");
    }


    @AfterSuite
    public void afterSuite()
    {
        System.out.println("Run after suite");
    }
}
