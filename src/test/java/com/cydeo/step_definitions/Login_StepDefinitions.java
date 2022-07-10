package com.cydeo.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_StepDefinitions {

    @Given("user is on the library login page")
    public void user_is_on_the_library_login_page() {
        System.out.println("User is on the library login page");
    }
    @When("user enter librarian username")
    public void user_enter_librarian_username() {
        System.out.println("User enters librarian username");
    }
    @When("user enter librarian password")
    public void user_enter_librarian_password() {
        System.out.println("User enters librarian password");
    }
    @Then("user should see dashboard")
    public void user_should_see_dashboard() {
        System.out.println("User should see dashboard");
    }

    @When("user enter student username")
    public void user_enter_student_username() {
        System.out.println("User enters student username");
    }
    @When("user enter student password")
    public void user_enter_student_password() {
        System.out.println("User enters student password");
    }

    @When("user enter admin username")
    public void user_enter_admin_username() {
        System.out.println("User enters admin username");
    }
    @When("user enter admin password")
    public void user_enter_admin_password() {
        System.out.println("User enters admin password");
    }

}
