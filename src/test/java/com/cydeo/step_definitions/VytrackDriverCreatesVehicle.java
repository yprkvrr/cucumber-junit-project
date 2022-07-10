package com.cydeo.step_definitions;

import com.cydeo.pages.VytrackLoginPage;
import com.cydeo.pages.VytrackVehicleCost;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class VytrackDriverCreatesVehicle {

    VytrackVehicleCost vehicleCost = new VytrackVehicleCost();

    @Given("truck driver is on the Vehicle Cost Page")
    public void truck_driver_is_on_the_vehicle_cost_page() throws InterruptedException {
        Driver.getDriver().get(ConfigurationReader.getProperty("vytrack.url"));
        VytrackLoginPage vytrackLoginPage = new VytrackLoginPage();
        vytrackLoginPage.login(ConfigurationReader.getProperty("vytrack.username"), ConfigurationReader.getProperty("vytrack.password"));
        Thread.sleep(3000);


        Actions actions = new Actions(Driver.getDriver());

        actions.moveToElement(vehicleCost.fleetModule).perform();

        vehicleCost.vehicleCost.click();

        Thread.sleep(3000);


    }

    @When("driver clicks on Create Vehicle Cost")
    public void driver_clicks_on_create_vehicle_cost() throws InterruptedException {
        vehicleCost.vehicleCostCreate.click();

    }

    @When("driver should be able to create Vehicle cost")
    public void driver_should_be_able_to_create_vehicle_cost() throws InterruptedException {
        Select select = new Select(Driver.getDriver().findElement(By.xpath("//select[@name='custom_entity_type[Type]']")));
        select.selectByValue("summer_tires");

        vehicleCost.totalPriceButton.sendKeys("500");
        vehicleCost.dateButton.click();

        Driver.getDriver().findElement(By.xpath("//button[@data-handler='today']")).click();
        Thread.sleep(3000);
        vehicleCost.costDescription.sendKeys("Summer Tires");

        vehicleCost.chassisNumber.click();

        Driver.getDriver().findElement(By.xpath("//td[.='3,444,355']")).click();

        vehicleCost.chassisSelect.click();

        vehicleCost.licensePlate.click();

        Driver.getDriver().findElement(By.xpath("//td[.='abc2022']")).click();

        vehicleCost.licenseSelect.click();

    }

    @Then("driver should be able to cancel")
    public void driver_should_be_able_to_cancel() {
        vehicleCost.cancelButton.click();

    }

}
