package com.cydeo.pages;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SmartBearOrderPage {

    public SmartBearOrderPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(css = "#ctl00_MainContent_username")
    public WebElement userName;

    @FindBy(css = "#ctl00_MainContent_password")
    public WebElement passWord;

    @FindBy(css = "#ctl00_MainContent_login_button")
    public WebElement loginButton;

    @FindBy(linkText = "Order")
    public WebElement orderButton;


    @FindBy(xpath = "//select[@id='ctl00_MainContent_fmwOrder_ddlProduct']")
    public WebElement productDropdown;

    @FindBy(css = "#ctl00_MainContent_fmwOrder_txtQuantity")
    public WebElement quantity;

    @FindBy(css = "#ctl00_MainContent_fmwOrder_txtName")
    public WebElement customerName;

    @FindBy(css = "#ctl00_MainContent_fmwOrder_TextBox2")
    public WebElement street;


    @FindBy(css = "#ctl00_MainContent_fmwOrder_TextBox3")
    public WebElement city;


    @FindBy(css = "#ctl00_MainContent_fmwOrder_TextBox4")
    public WebElement state;


    @FindBy(css = "#ctl00_MainContent_fmwOrder_TextBox5")
    public WebElement zip;

    @FindBy(xpath = "//input[@type='radio']")
    public List<WebElement> cardType;

    @FindBy(css = "#ctl00_MainContent_fmwOrder_TextBox6")
    public WebElement cardNumber;

    @FindBy(css = "#ctl00_MainContent_fmwOrder_TextBox1")
    public WebElement expireDate;
    @FindBy(xpath = "//a[.='Process']")
    public WebElement process;

    @FindBy(linkText = "View all orders")
    public WebElement viewOrder;


    public void loginSmart(String username, String password) {
        Driver.getDriver().get(ConfigurationReader.getProperty("smart.bear.url"));
        userName.sendKeys(username);
        passWord.sendKeys(password);
        loginButton.click();
    }


}
