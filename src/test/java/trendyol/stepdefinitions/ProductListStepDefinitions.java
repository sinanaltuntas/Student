package trendyol.stepdefinitions;

import io.cucumber.java.en.When;
import trendyol.pages.ProductListPage;

public class ProductListStepDefinitions {

    @When("Select any product")
    public void select_any_product() throws InterruptedException {

        Thread.sleep(2000);
        ProductListPage productListPage = new ProductListPage();
        productListPage.product.click();

    }
}
