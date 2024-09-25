package io.learn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersTestCase {
WebDriver driver;
    @BeforeClass
    @Parameters({"browser","url"})
    public void setup(String browser, String url)
    {
        if (browser.equalsIgnoreCase("chrome"))
        {
            driver = new ChromeDriver();
            driver.get(url);
        }

        else if (browser.equalsIgnoreCase("firefox"))
        {
            driver = new FirefoxDriver();
            driver.get(url);
        }
        driver.get(url);
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
