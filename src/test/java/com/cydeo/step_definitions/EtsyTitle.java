package com.cydeo.step_definitions;

import com.cydeo.pages.EtsyPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.fr.Et;
import org.junit.Assert;

public class EtsyTitle {

    EtsyPage etsyPage=new EtsyPage();

    @Given("when user open Etsy page")
    public void when_user_open_etsy_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("etsy.url"));
    }

    @Then("user should see Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone title")
    public void user_should_see_etsy_shop_for_handmade_vintage_custom_and_unique_gifts_for_everyone_title() {
        Assert.assertEquals("Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone",Driver.getDriver().getTitle());
    }

    @When("user types Wooden Spoon in the search box")
    public void user_types_wooden_spoon_in_the_search_box() {

        etsyPage.searchBox.sendKeys("Wooden Spoon");
    }
    @When("user clicks search button")
    public void user_clicks_search_button() {

        etsyPage.searchButton.click();
    }
    @Then("user should see Wooden Spoon is in the title")
    public void user_should_see_wooden_spoon_is_in_the_title() {
        Assert.assertEquals("Wooden spoon - Etsy",Driver.getDriver().getTitle());
    }


    @Then("user should see {string} is in the title")
    public void user_should_see_is_in_the_title(String string) {
Assert.assertEquals(string,Driver.getDriver().getTitle());
    }

    @When("user types {string} in the search box")
    public void user_types_in_the_search_box(String string) {
       etsyPage.searchBox.sendKeys(string);
    }


}
