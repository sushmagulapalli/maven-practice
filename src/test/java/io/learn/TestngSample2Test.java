package io.learn;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestngSample2Test {

    @Test(priority = 1)
    void setup() {
        System.out.println("This is Opening browser");

    }

    @Test(priority = 2)
    void login() {
        System.out.println("this is login test");
    }

    @Test(priority = 3)
    void logout() {
        System.out.println("closing browser");
    }
}
