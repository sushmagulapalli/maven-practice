package io.learn.HomeTasks;

import org.testng.annotations.Test;

public class PriorityTests {

    @Test(priority = 0)
    public void setup()
    {
        System.out.println("Starting the computer");
    }

    @Test(priority = 1)
    public void started()
    {
        System.out.println("computer is started");
    }

    @Test(priority = 2)
    public void working()
    {
        System.out.println("COmputer is working");
    }

    @Test(priority = 3)
            public void closing()
    {
        System.out.println("Closing the computer");
    }

}
