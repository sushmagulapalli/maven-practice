package io.learn;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyTestCase {

    @Test
    void startCar() {
        System.out.println("car started");
        Assert.fail();
    }

    @Test(dependsOnMethods = {"startCar"})
    void driveCar() {
        System.out.println("Driving the car");
    }

    @Test(dependsOnMethods = {"driveCar"})
    void stopCar() {
        System.out.println("car stopped");
    }

    @Test(dependsOnMethods = {"stopCar", "driveCar"},alwaysRun = true)
    void parkcar() {
        System.out.println("car parked");
    }
}
