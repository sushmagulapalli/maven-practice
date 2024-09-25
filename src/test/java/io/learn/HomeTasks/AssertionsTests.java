package io.learn.HomeTasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.security.cert.TrustAnchor;
import java.time.Duration;

public class AssertionsTests {

    WebDriver driver;
    @Test
    public void homePage()
    {
        driver= new ChromeDriver();
        driver.get("https://www.justinmind.com/");
        String title=driver.getTitle();
        Assert.assertEquals(title ,"Free prototyping tool for web & mobile apps - Justinmind");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
    }


    @Test
    public void downloadImage()
    {
        driver=new ChromeDriver();
        driver.get("https://www.justinmind.com/");
        WebElement name= driver.findElement(By.className("download-mobile"));
        Assert.assertTrue(name.isDisplayed(),"Not displayed");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
    }
@Test
    public void tearDown()
{
    driver.quit();
}
}
