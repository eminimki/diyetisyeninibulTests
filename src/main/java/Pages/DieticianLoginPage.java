package Pages;

import Utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DieticianLoginPage extends AbstractClass{
    WebDriver driver;
    public DieticianLoginPage() {
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "email")
    private WebElement dieticianEmailTextArea;
    public void  sendDieticianEmail(String dieticianemail){
        sendKeysMethod(dieticianEmailTextArea, dieticianemail);
    }

    @FindBy(id = "password")
    private WebElement dieticianPasswordArea;
    public void sendDieticianPassword(String dieticianPassword){
        sendKeysMethod(dieticianPasswordArea,dieticianPassword);
    }

    @FindBy(id = "login")
    private WebElement dieticianLoginButton;
    public void clickOnDieticianLoginButton(){
        clickMethod(dieticianLoginButton);
    }


}
