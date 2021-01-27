package trendyol.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import trendyol.pages.MainPage;

public class MainStepDefinitions {

    @Given("Go to searchbar")
    public void go_to_searchbar() throws InterruptedException {
        MainPage mainPage = new MainPage();
        Thread.sleep(2000);
        mainPage.closeButton.click();
        Thread.sleep(3000);
    }

    @When("Write {string}")
    public void write(String str) {

        MainPage mainPage=new MainPage();
        mainPage.searchBox.sendKeys(str, Keys.ENTER);

    }

    @Then("User should see product list page")
    public void user_should_see_product_list_page() {

    }
}
