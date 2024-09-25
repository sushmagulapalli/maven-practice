package io.learn.HomeTasks;

import org.testng.annotations.Test;

import javax.sound.midi.Soundbank;
import java.util.logging.SocketHandler;

public class DependencyTests {

    @Test
    public void carStarts()
    {
        System.out.println("Car is started");
    }

    @Test(dependsOnMethods = {"carStarts"})
    public void carDrive()
    {
        System.out.println("Driving the Car");
    }

    @Test(dependsOnMethods = {"carDrive"})
    public void carRunning()
    {
        System.out.println("car is running");
    }

    @Test(dependsOnMethods = {"carRunning"},enabled = false)
    public void carStop()
    {
        System.out.println("Car is stopped");
    }

    @Test

    public void carParked()
    {
        System.out.println("Car is parked");
    }
}
