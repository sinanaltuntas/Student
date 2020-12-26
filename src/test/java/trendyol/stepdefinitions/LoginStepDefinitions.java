package trendyol.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import trendyol.utilities.ConfigurationReader;
import trendyol.utilities.MyDriver;

public class LoginStepDefinitions {
    @Given("user opens the login page")
    public void use_opens_the_login_page() throws InterruptedException {
      String url1 = ConfigurationReader.get("url");
        MyDriver.getdriver().get(url1);
        Thread.sleep(5000);
    }

    @When("he enters the credentials")
    public void he_enters_the_credentials() {

    }

    @Then("able to login")
    public void able_to_login() {

    }

}
