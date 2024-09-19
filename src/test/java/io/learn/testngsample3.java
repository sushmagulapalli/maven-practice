package io.learn;

import org.testng.annotations.Test;

public class testngsample3 {
    @Test(priority = 1)
    void First()
    {
        System.out.println("Primary School");
    }

    @Test
    void Second()
    {
        System.out.println("Secondary School");
    }

    @Test

    void Third()
    {
        System.out.println("Degree college");
    }
}
