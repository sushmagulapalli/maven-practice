package io.learn.HomeTasks;

import org.testng.annotations.Test;

public class SkipException {


    @Test(enabled = false)
    public void skipTest()
    {
        System.out.println("I am 5 years old");
    }

    @Test
    public void yearstest()
    {
        System.out.println("I am 10 years old");
    }
}
