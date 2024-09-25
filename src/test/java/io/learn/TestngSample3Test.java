package io.learn;

import org.testng.annotations.Test;

public class TestngSample3Test {

    @Test(priority = 1)
    void first()
    {
        System.out.println("Primary School");
    }

    @Test
    void second()
    {
        System.out.println("Secondary School");
    }

    @Test
    void third()
    {
        System.out.println("Degree college");
    }
}
