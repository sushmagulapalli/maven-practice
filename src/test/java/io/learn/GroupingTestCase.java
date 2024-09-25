package io.learn;

import org.testng.annotations.Test;

public class GroupingTestCase {
    @Test(groups = {"sanity"})
    void test1()
    {
        System.out.println("test 1 is executes");
    }
    @Test(groups = {"regression"})
    void test2()
    {
        System.out.println("test 2 is executes");
    }
    @Test(groups = {"sanity"})
    void test3()
    {
        System.out.println("test 3 is executes");
    }
    @Test (groups ={"sanity"})
    void test4()
    {
        System.out.println("test 4 is executes");
    }
    @Test (groups= {"sanity","regression"})
    void test5()
    {
        System.out.println("test 5 is executes");
    }
}
