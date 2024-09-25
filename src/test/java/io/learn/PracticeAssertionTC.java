package io.learn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class PracticeAssertionTC {
WebDriver driver;
    @BeforeClass
    public void setup()
    {
        WebDriver driver= new ChromeDriver();
        driver.get("https://thedot.wipro.com/");
    }

    @Test
    public void homePage()
    {
        String title =driver.getTitle();
        Assert.assertEquals(title,"The Dot Home");
    }
}
