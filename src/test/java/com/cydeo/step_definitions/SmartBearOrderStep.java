package com.cydeo.step_definitions;

import com.cydeo.pages.SmartBearOrderPage;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class SmartBearOrderStep {

    SmartBearOrderPage page = new SmartBearOrderPage();

    @Given("User is logged into SmartBear Tester account and on Order page")
    public void user_is_logged_into_smart_bear_tester_account_and_on_order_page() {
        page.loginSmart(ConfigurationReader.getProperty("smart.bear.username"), ConfigurationReader.getProperty("smart.bear.password"));
        page.orderButton.click();
    }


    @When("User selects {string} from product dropdown")
    public void userSelectsFromProductDropdown(String productType) {
        Select select = new Select(Driver.getDriver().findElement(By.xpath("//select[@id='ctl00_MainContent_fmwOrder_ddlProduct']")));

        select.selectByVisibleText(productType);
    }

    @And("enters {int} to quantity")
    public void entersToQuantity(int number) {
        page.quantity.clear();
        page.quantity.sendKeys(String.valueOf(number));
    }


    @When("enters {string} to costumer name")
    public void enters_to_costumer_name(String customerName) {
        page.customerName.sendKeys(customerName);
    }

    @When("enters {string} to street")
    public void enters_to_street(String street) {
        page.street.sendKeys(street);
    }

    @When("enters {string} to city")
    public void enters_to_city(String city) {
        page.city.sendKeys(city);
    }

    @When("enters {string} to state")
    public void enters_to_state(String state) {
        page.state.sendKeys(state);
    }

    @When("enters {string}")
    public void enters(String zip) {
        page.zip.sendKeys(zip);
    }

    @When("selects {string} as card type")
    public void selects_as_card_type(String cardType) {

        List<WebElement> cardTypes = page.cardType;
        for (WebElement element :cardTypes) {
            if (element.getAttribute("value").equalsIgnoreCase(cardType)) {
                element.click();
            }
        }
    }

    @When("enters {string} to card number")
    public void enters_to_card_number(String cardNumber) {
        page.cardNumber.sendKeys(cardNumber);
    }

    @When("enters {string} to expiration date")
    public void enters_to_expiration_date(String expirationDate) {
        page.expireDate.sendKeys(expirationDate);
    }

    @When("clicks process button")
    public void clicks_process_button() throws InterruptedException {
        page.process.click();

    }

    @Then("verifies {string} is in the list")
    public void verifies_is_in_the_list(String string) {
        page.viewOrder.click();
        WebElement name=Driver.getDriver().findElement(By.xpath("(//table[@class='SampleTable']//td)[2]"));

        Assert.assertEquals(string,name.getText());
    }

}
