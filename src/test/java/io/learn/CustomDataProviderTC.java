package io.learn;

import org.testng.annotations.DataProvider;

public class CustomDataProviderTC {

    @DataProvider(name = "Login Data Provider")
    public Object[][] getData() {
        return new Object[][]{
                {"sushmaqa@gmail.com", "Passion235"},
                {"pinky@gmail.com", "Lotus"},
                {"sony@gmail.com", "pinky"}
        };
    }
}
