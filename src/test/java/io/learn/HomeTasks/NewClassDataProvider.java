package io.learn.HomeTasks;

import org.testng.annotations.DataProvider;

public class NewClassDataProvider {

    @DataProvider(name = "Epri Home page")
    public Object[][] getData() {
        return new Object[][]{
                {"Sanjana@gmail.com", "sanjana"},
                {"Sangamithra@gmail.com", "sangamitra"},
                {"Suresh@gmail.com", "suresh"}

        };
    }



}
