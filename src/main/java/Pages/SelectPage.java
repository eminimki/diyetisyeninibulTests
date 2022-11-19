package Pages;

import Utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectPage extends AbstractClass{
    WebDriver driver;
    public SelectPage(){
        driver= Driver.getDriver();
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "select")
    private WebElement firstDieticianButton;
    public void clickOnFirstDieticianButton(){
        clickMethod(firstDieticianButton);
    }
}
