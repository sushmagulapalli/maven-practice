package io.learn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class PracticeTestCase {
    WebDriver driver;

    @BeforeClass
    public void setup() {
         driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");
    }

    @Test
    public void homepage() {
        String title = driver.getTitle();
        Assert.assertEquals(title, "OrangeHRM"," is not matched");
    }

    @AfterClass
    public void teardown()
    {
        driver.quit();
    }
}
