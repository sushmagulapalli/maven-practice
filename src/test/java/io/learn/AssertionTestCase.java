package io.learn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.time.Duration;

public class AssertionTestCase {
WebDriver driver;
    @BeforeClass
    public void setup()
    {
        driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
    }
@Test
    public void logotest()
    {
        WebElement logo=driver.findElement(By.xpath("//img[@alt='company-branding']"));
        Assert.assertTrue(logo.isDisplayed(),"logo not displayed");
    }

    @Test
    public void homepagetitle()
    {
       String title= driver.getTitle();
       Assert.assertEquals(title,"OrangeHRM");
    }
}
