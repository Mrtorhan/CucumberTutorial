package com.cybertek.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinitions {

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {

        System.out.println("I'm on the login page");
    }


    @When("user logs in as a store manager")
    public void user_logs_in_as_a_store_manager() {

        System.out.println("Trying to login as a store manager");
    }

    @Then("user should be able to see the Dashboard's page title")
    public void user_should_be_able_to_see_the_dashboard_s_page_title() {

        System.out.println("I see that page title is Dashboard");

    }

    @Given("user is on the login page1")
    public void user_is_on_the_login_page1() {

        System.out.println("I'm on the login page");
    }


    @When("user logs in as a sales manager")
    public void user_logs_in_as_a_sales_manager() {

        System.out.println("Trying to login as a sales manager");
    }

    @Then("user should be able to see the Dashboard's page title1")
    public void user_should_be_able_to_see_the_dashboard_s_page_title3() {

        System.out.println("I see that page title is Dashboard");

    }


    @Given("user is on the login page2")
    public void user_is_on_the_login_page2() {

        System.out.println("I'm on the login page");
    }


    @When("user logs in as a driver")
    public void user_logs_in_as_a_driver() {

        System.out.println("Trying to login as a driver");
    }

    @Then("user should be able to see the Dashboard's page title2")
    public void user_should_be_able_to_see_the_dashboard_s_page_title2() {

        System.out.println("I see that page title is Dashboard");

    }

    @When("user enters {string} and {string}")
    public void user_enters_and(String username, String password) {
        System.out.printf("Enter username %s, and password %s to login\n", username, password);
    }


}