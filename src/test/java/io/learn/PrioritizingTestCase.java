package io.learn;

import org.testng.annotations.Test;

public class PrioritizingTestCase {

    @Test (priority = 0)
    void login() {
        System.out.println("zero rank");
    }

    @Test (priority = 1)
    void logout() {

        System.out.println("Second rank");
    }

    @Test (priority = 2,enabled = false)
    void home() {
        System.out.println("Third rank");
    }

}
