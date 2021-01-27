package trendyol.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductListPage extends BasePage{

    @FindBy(css = "[data-id='52238130']")
    public WebElement product;

}
