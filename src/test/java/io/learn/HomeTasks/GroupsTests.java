package io.learn.HomeTasks;

import org.testng.annotations.Test;

//TestNG Groups: Write a program //
//to group multiple test methods and execute a specific group of tests using TestNG.//
public class GroupsTests {

    @Test(groups = {"sanity"})
    public void testOne()
    {
        System.out.println("Excuete  test one");
    }
    @Test(groups = {"regression"})
    public void testTwo()
    {
        System.out.println("excuete test two");
    }
    @Test(groups = "production")
    public void testThree()
    {
        System.out.println("excute test three");
    }
    @Test(groups = "sanity")
     public void testFour()
    {
        System.out.println("excute test four");
    }

    @Test(groups = "regression")
    public void testFive()
    {
        System.out.println("excute test five");
    }

}
