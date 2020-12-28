package trendyol.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import trendyol.utilities.ConfigurationReader;
import trendyol.utilities.MyDriver;

import java.sql.DriverManager;

public class LoginPage extends BasePage{

    public void login() throws InterruptedException {
        String url1 = ConfigurationReader.get("url");
        MyDriver.getdriver().get(url1);
        MyDriver.getdriver().manage().window().maximize();
        Thread.sleep(5000);
    }

    @FindBy(css = "[title='Close']")
    public WebElement closeButton;

    @FindBy(css = "[class='i-user-orange hover-icon']")
    public WebElement loginDropdown;

    @FindBy(css = "[class='login-button']")
    public WebElement loginButton;

    @FindBy(css = "[id='login-email']")
    public WebElement email;

    @FindBy(css = "[name='login-password']")
    public WebElement password;




}
