package trendyol.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends BasePage{


    @FindBy(css = "[class=\"modal-close\"]")
    public WebElement closeButton;

    @FindBy(css = "[class=\"search-box\"]")
    public WebElement searchBox;


}
