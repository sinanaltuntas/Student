package trendyol.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import trendyol.pages.LoginPage;
import trendyol.utilities.ConfigurationReader;
import trendyol.utilities.MyDriver;


public class LoginStepDefinitions {
    @Given("user opens the login page")
    public void use_opens_the_login_page() throws InterruptedException {
      /*String url1 = ConfigurationReader.get("url");
        MyDriver.getdriver().get(url1);
        Thread.sleep(5000);

       */

        LoginPage loginPage= new LoginPage();
        loginPage.login();

    }

    @When("he enters the credentials")
    public void he_enters_the_credentials() throws InterruptedException {

        LoginPage loginPage= new LoginPage();

        Thread.sleep(2000);
        loginPage.closeButton.click();
        Thread.sleep(3000);



        Actions hover = new Actions(MyDriver.getdriver());
        hover.moveToElement(loginPage.loginDropdown).perform();
        Thread.sleep(5000);

        loginPage.loginButton.click();
        Thread.sleep(5000);


    }

    @Then("able to login")
    public void able_to_login() throws InterruptedException {

        String username=ConfigurationReader.get("username");
        String password=ConfigurationReader.get("password");

        LoginPage loginPage = new LoginPage();

        loginPage.email.sendKeys(username);
        loginPage.password.sendKeys(password, Keys.ENTER);
        Thread.sleep(5000);

    }

}
