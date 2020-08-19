package com.freeCRM.stepDefinitions;

import com.freeCRM.utilities.ConfigurationReader;
import com.freeCRM.utilities.MyDriver;
import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hook {

    @Before
    public void setUp(){
        System.out.println("### setup! start ###");
        MyDriver.getDriver().manage().window().maximize();
        MyDriver.getDriver().get(ConfigurationReader.getProperty("Url"));
    }




    @After
    public void teardown(Scenario scenario){
        if(scenario.isFailed()){
            System.out.println("Test Failed! Check out your screen shot");
            TakesScreenshot takesScreenshot = (TakesScreenshot) MyDriver.getDriver();
            byte[] screenshot = takesScreenshot.getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshot, "image/png", scenario.getName());
        }
        System.out.println("Test clean up");
        MyDriver.closeDriver();
    }
}
