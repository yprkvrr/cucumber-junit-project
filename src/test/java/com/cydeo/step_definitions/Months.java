package com.cydeo.step_definitions;

import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Months {
    @Given("User is on the dropdowns page of practice tool")
    public void user_is_on_the_dropdowns_page_of_practice_tool() {
        Driver.getDriver().get("https://practice.cydeo.com/dropdown ");


    }

    @Then("User should see below info in month dropdown")
    public void user_should_see_below_info_in_dropdown(List<String> months) {
        List<WebElement> month = Driver.getDriver().findElements(By.xpath("//select[@id='month']//option"));

        for (int i = 0; i < months.size(); i++) {
            Assert.assertEquals(months.get(i),month.get(i).getText());
            System.out.println(month.get(i).getText());
        }

    }

}
