package io.learn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import java.time.Duration;


public class ParallelTestCase1 {


    WebDriver driver;

    @Test (priority = 0)
    public void setup() {
        driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");
        String title = driver.getTitle();
        Assert.assertEquals(title, "OrangeHRM");
    }

    @Test(priority = 1)
    public void loginTest()   {
        driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Assert.assertEquals(driver.getTitle(), "OrangeHRM");

    }
    @AfterClass
    public void teardown()
    {
        driver.quit();
    }

}

