package io.learn.HomeTasks;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class ParallelTests {


    WebDriver driver;
    @Test
    public void testCaseOne()
    {
     driver=new ChromeDriver();
     driver.get("https://www.justinmind.com/");
     String title = driver.getTitle();
     Assert.assertEquals(title,"Free prototyping tool for web & mobile apps - Justinmind");
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
    }


    @Test
    public void testCaseTwo()
    {
        driver=new ChromeDriver();
        driver.get("https://www.justinmind.com/");
        driver.findElement(By.className("download-mobile")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
    }
}
