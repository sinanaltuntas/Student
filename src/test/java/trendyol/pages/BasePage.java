package trendyol.pages;

import org.openqa.selenium.support.PageFactory;
import trendyol.utilities.MyDriver;

public abstract class BasePage {

    public BasePage(){

        PageFactory.initElements(MyDriver.getdriver(),this);
    }

}
