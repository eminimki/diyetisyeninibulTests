package Pages;

import Utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConfirmPage extends AbstractClass{
    WebDriver driver;
    public ConfirmPage() {
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "confirmMessage")
    private WebElement orderConfirmMessage;
    public void checkOrderconfirmMessage(String expected){
        Assertion(orderConfirmMessage,expected);
    }
}
