package Pages;

import Utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddDieticianPage extends AbstractClass{
    WebDriver driver;
    public AddDieticianPage() {
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "firstName")
    private WebElement dieticianNameTextArea;
    public void typeDieticianName(String dieticianName){
        sendKeysMethod(dieticianNameTextArea,dieticianName);
    }

    @FindBy(id = "lastName")
    private WebElement dieticianLastNameTextArea;
    public void typeDieticianLastName(String dieticianLastName){
        sendKeysMethod(dieticianLastNameTextArea,dieticianLastName);
    }

    @FindBy(id = "bio")
    private WebElement dieticianBioTextArea;
    public void typeDieticianBio(String dieticianBio){
        sendKeysMethod(dieticianBioTextArea,dieticianBio);
    }

    @FindBy(id = "rating")
    private WebElement dieticianRatingTextArea;
    public void typeDieticianRating(String dieticianRating){
        clearInsideTextArea(dieticianRatingTextArea);
        sendKeysMethod(dieticianRatingTextArea,dieticianRating);
    }

    @FindBy(id = "submit")
    private WebElement addDieticianButton;
    public void clickOnAddDieticianButton(){
        clickMethod(addDieticianButton);
    }

    @FindBy(xpath = "/html/body")
    private WebElement addDieticianConfirmMessageTextArea;
    public void checkAddDieticianConfirmMessage(String addDieticianConfirmMessage){
        Assertion(addDieticianConfirmMessageTextArea,addDieticianConfirmMessage);
    }
}
