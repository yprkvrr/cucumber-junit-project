package com.cydeo.step_definitions;

import com.cydeo.pages.VytrackLoginPage;
import com.cydeo.pages.VytrackVehicleCost;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Actions;

public class DriverAddsAttachment {
    VytrackVehicleCost vehicleCost = new VytrackVehicleCost();

    @Given("Truck driver is on the Vehicle Cost Page")
    public void truck_driver_is_on_the_vehicle_cost_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("vytrack.url"));
        VytrackLoginPage login = new VytrackLoginPage();
        login.login(ConfigurationReader.getProperty("vytrack.username"), ConfigurationReader.getProperty("vytrack.password"));

        Actions actions = new Actions(Driver.getDriver());

        actions.moveToElement(vehicleCost.fleetModule).perform();

        vehicleCost.vehicleCost.click();

    }

    @When("driver clicks any car on the grid")
    public void driver_clicks_any_car_on_the_grid() {
        vehicleCost.allCars.get(3).click();

    }

    @Then("driver should be able to see general information about the car")
    public void driver_should_be_able_to_see_general_information_about_the_car() {

    }

    @Then("driver clicks on Add Attachment")
    public void driver_clicks_on_add_attachment() {

    }

    @Then("driver should be able to add an attachment")
    public void driver_should_be_able_to_add_an_attachment() {

    }

}
