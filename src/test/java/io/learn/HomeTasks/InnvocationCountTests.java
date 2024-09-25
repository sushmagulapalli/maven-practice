package io.learn.HomeTasks;

import org.testng.annotations.Test;

public class InnvocationCountTests {

    @Test(invocationCount = 5)
    public void count()
    {
        System.out.println("My name is Sushma Gulapalli");
    }
}
