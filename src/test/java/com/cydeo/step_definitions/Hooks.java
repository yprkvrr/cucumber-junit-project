package com.cydeo.step_definitions;

import com.cydeo.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {
    //@Before is coming from cucumber. It is running before each scenario
    @Before
    public void setup() {
        System.out.println("--> It is coming from @Before in Hooks ");
    }

    @After
    public void tearDown(Scenario scenario) {
        System.out.println("--> It is coming from @After in Hooks ");

        if (scenario.isFailed()) {
            byte[] screenShot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenShot, "image/png", scenario.getName());
        }
        Driver.closeDriver();
    }
}
