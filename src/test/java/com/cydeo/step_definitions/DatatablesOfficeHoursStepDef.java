package com.cydeo.step_definitions;

import com.cydeo.pages.VytrackHomePage;
import com.cydeo.pages.VytrackLoginPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;
import java.util.Map;

public class DatatablesOfficeHoursStepDef {
    VytrackLoginPage loginPage = new VytrackLoginPage();
    VytrackHomePage vytrackHomePage = new VytrackHomePage();

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("vytrack.url"));
    }

    @When("user enters the {string} information")
    public void user_enters_the_information(String string) {
        String username = ConfigurationReader.getProperty(string + "_username");
        String password = ConfigurationReader.getProperty(string + "_password");

        loginPage.login(username, password);
    }

    @Then("user should be able to see following modules")
    public void user_should_be_able_to_see_following_modules(List<String> expectedModules) {

        BrowserUtils.waitFor(3);
        List<String> actualModulesName = BrowserUtils.getElementsText(new VytrackHomePage().allModules);

        Assert.assertEquals(expectedModules, actualModulesName);
    }

    @When("user enter below credentials")
    public void user_enter_below_credentials(Map<String, String> credentials) {
        String username = credentials.get("username");
        String password = credentials.get("password");
        loginPage.login(username, password);
        BrowserUtils.waitFor(3);
    }

    @Then("user should be able to see following information")
    public void user_should_be_able_to_see_following_information(Map<String, String> information) {
        String actualUserInfo = vytrackHomePage.username.getText();
        String expected = information.get("firstname") + " " + information.get("lastname");
        Assert.assertEquals(expected,actualUserInfo);
    }


}
