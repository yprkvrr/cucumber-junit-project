package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class VytrackVehicleCost {
    public VytrackVehicleCost() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//span[@class='title title-level-1'])[1]")
    public WebElement fleetModule;

    @FindBy(xpath = "//span[.='Vehicle Costs']")
    public WebElement vehicleCost;

    @FindBy(xpath = "//a[@title='Create Vehicle Costs']")
    public WebElement vehicleCostCreate;

    @FindBy(name = "custom_entity_type[TotalPrice]")
    public WebElement totalPriceButton;

    @FindBy(xpath = "//input[@placeholder='Choose a date']")
    public WebElement dateButton;

    @FindBy(css = "textarea[id*='custom_entity_type_Cost']")
    public WebElement costDescription;

    @FindBy(xpath = "(//button[@class='btn btn-medium add-btn'])[1]")
    public WebElement chassisNumber;

    @FindBy(xpath = "//button[.='Select']")
    public WebElement chassisSelect;

    @FindBy(xpath = "(//button[@class='btn btn-medium add-btn'])[2]")
    public WebElement licensePlate;

    @FindBy(xpath = "//button[.='Select']")
    public WebElement licenseSelect;

    @FindBy(xpath = "//a[@title='Cancel']")
    public WebElement cancelButton;

    @FindBy(xpath = "//td[@class='number-cell grid-cell grid-body-cell grid-body-cell-TotalPrice']")
    public List<WebElement> allCars;
}
