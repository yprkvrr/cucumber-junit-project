package com.cydeo.step_definitions;

import com.cydeo.pages.AdidasPage;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;
import java.util.Map;

public class AdidasStepdef {

    AdidasPage adidasPage = new AdidasPage();

    @Given("User is on the HomePage")
    public void user_is_on_the_home_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("adidasUrl"));
    }

    @Then("User should be able to see expected prices in following products")
    public void user_should_be_able_to_see_expected_prices_in_following_products(List<Map<String, String>> productDetails) {
        for (Map<String, String> productDetail : productDetails) {
            System.out.println("=======Product details=======");
            System.out.println(productDetail.get("Category"));
            adidasPage.clickCategory(productDetail.get("Category"));


            System.out.println(productDetail.get("Product"));

            String actualProductPrice=adidasPage.getProductPrice(productDetail.get("Product"));
            System.out.println(productDetail.get("expectedPrice"));
            String expected=productDetail.get("expectedPrice");

            Assert.assertEquals(expected,actualProductPrice);

        }
    }

    //    @Given("User is on the HomePage")
//    public void user_is_on_the_home_page() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
    @Then("User should be able to see expected prices in following products with listOflist")
    public void user_should_be_able_to_see_expected_prices_in_following_products_with_list_oflist(io.cucumber.datatable.DataTable dataTable) {

    }


    @Then("User should be able to see following names in their groups")
    public void user_should_be_able_to_see_following_names_in_their_groups(io.cucumber.datatable.DataTable dataTable) {


    }
}
