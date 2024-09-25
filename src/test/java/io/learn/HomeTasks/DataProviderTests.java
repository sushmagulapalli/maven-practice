package io.learn.HomeTasks;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
//TestNG Data Provider: Write a program to demonstrate the use of Data Provider in TestNG. Use Data Provider to pass different sets of data to a test method.//
public class DataProviderTests {
  @Test(dataProvider = "Epri Home page", dataProviderClass = NewClassDataProvider.class)
    public void homePageLogin(String username , String password)
    {
        System.out.println(username+"  "+password);
    }
}
