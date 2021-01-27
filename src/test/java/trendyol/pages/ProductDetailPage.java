package trendyol.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductDetailPage extends BasePage{

    @FindBy(css = "[class='pr-in-w'] [class='prc-slg']")
    public WebElement price;

    @FindBy(css = "[class=\"add-to-bs-tx\"]")
    public WebElement addToBasket;


}
