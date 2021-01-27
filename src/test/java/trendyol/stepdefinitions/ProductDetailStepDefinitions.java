package trendyol.stepdefinitions;

import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import trendyol.pages.ProductDetailPage;
import trendyol.utilities.MyDriver;

public class ProductDetailStepDefinitions {

    @When("User click Add to Basket")
    public void user_click_Add_to_Basket() throws InterruptedException {

        ProductDetailPage productDetailPage = new ProductDetailPage();

        String price=productDetailPage.price.getText();
        System.out.println("price = " + price);

        Thread.sleep(2000);
        Actions actions=new Actions(MyDriver.getdriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        Thread.sleep(2000);
        productDetailPage.addToBasket.click();


    }
}
