package io.learn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SampleTest {

    WebDriver driver;

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
    }

    @Test
    public void testMe() {
        String title = driver.getTitle();
        Assert.assertEquals(title, "The Internet");
    }

    @Test
    public void testMe2() {
        WebElement element = driver.findElement(By.xpath("//h2"));
        Assert.assertEquals(element.getText(), "Available Examples");
    }

    @AfterClass
    public void tearDown() {
        driver.close();
    }

}
