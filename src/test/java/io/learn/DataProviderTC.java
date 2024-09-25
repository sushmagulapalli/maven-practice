package io.learn;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTC {

    @Test(dataProvider = "Login Data Provider",dataProviderClass = CustomDataProviderTC.class)
    public void logintest(String email, String pwd)
    {
        System.out.println(email+"   "+pwd);
    }



}
