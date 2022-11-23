package Pages;

import Utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends AbstractClass{
    WebDriver driver;
    public LoginPage(){
        driver= Driver.getDriver();
        PageFactory.initElements(driver,this);
    }
    @FindBy(id = "email")
    private WebElement emailTextArea;
    public void emailSendKeys(String emailText){
        sendKeysMethod(emailTextArea,emailText);
    }

    @FindBy(id = "password")
    private WebElement passwordTextArea;
    public void passwordSendKeys(String passwordText){
        sendKeysMethod(passwordTextArea,passwordText);
    }

    @FindBy(id = "confirm")
    private WebElement confirmTextArea;
    public void confirmSendKeys(String confirmText){
        sendKeysMethod(confirmTextArea,confirmText);
    }

    @FindBy(id = "cardNumber")
    private WebElement cardNumberTextArea;
    public void cardNumberSendKeys(String cardNumberText){
        sendKeysMethod(cardNumberTextArea,cardNumberText);
    }

    @FindBy(id = "cardExpDate")
    private WebElement sktTextArea;
    public void sktSendKeys(String sktText){
        sendKeysMethod(sktTextArea,sktText);
    }

    @FindBy(id = "cvv")
    private WebElement cvvTextArea;
    public void cvvSendKeys(String cvvText){
        sendKeysMethod(cvvTextArea,cvvText);
    }

    @FindBy(id = "address")
    private WebElement addressTextArea;
    public void addressSendKeys(String addressText){
        sendKeysMethod(addressTextArea,addressText);
    }

    @FindBy(id = "submit")
    private WebElement submitButton;
    public void clickSubmitButton(){
        clickMethod(submitButton);
    }

    @FindBy(id = "admin")
    private WebElement adminButton;
    public void clickOnAdminButton(){
        clickMethod(adminButton);
    }

    @FindBy(id = "diyetisyen")
    private WebElement dieticianButton;
    public void clickOnDieticianButton(){
        clickMethod(dieticianButton);
    }

    public void checkURLVerify(String expected){ System.out.println(checkURL(expected));
    }

}
