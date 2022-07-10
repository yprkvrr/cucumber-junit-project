package com.cydeo.pages;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VytrackLoginPage {
    public VytrackLoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "prependedInput")
    public WebElement loginUser;

    @FindBy(id = "prependedInput2")
    public WebElement loginPass;

    @FindBy(id = "_submit")
    public WebElement loginBtn;

    public void login(String username, String password) {
        loginUser.sendKeys(username);
        loginPass.sendKeys(password);
        loginBtn.click();

    }

    public void dynamicLogin(String userType) {
        userType = userType.replace(" ", "_");
        String username = ConfigurationReader.getProperty(userType + "_username");
        String password = ConfigurationReader.getProperty(userType + "_password");

        login(username, password);
        loginBtn.click();

    }
}
