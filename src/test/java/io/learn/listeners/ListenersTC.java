package io.learn.listeners;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners (CustomListeners.class)
public class ListenersTC {

    @Test
    public void testOne() {
        System.out.println("This is the first case");
        Assert.assertEquals("A", "A");
    }

    @Test
    public void testTwo() {
        System.out.println("This is the second case");
        Assert.assertEquals("A", "B");
    }

    @Test
    public void testThree() {
        System.out.println("This is test three");
        throw new SkipException("This test case is skipped");
    }
}
