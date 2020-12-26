package trendyol.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyDriver {
    public static WebDriver getdriver(){
        WebDriver driver = null;
if(ConfigurationReader.get("browser").equalsIgnoreCase("chrome")){
    WebDriverManager.chromedriver().setup();
    driver= new ChromeDriver();
} return driver;
    }


}
