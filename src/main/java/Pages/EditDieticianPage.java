package Pages;

import Utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditDieticianPage extends AbstractClass{
    WebDriver driver;
    public EditDieticianPage() {
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "firstName")
    private WebElement editFirstNameTextArea;
    public void changeDieticianName(String dieticianName){
        clearInsideTextArea(editFirstNameTextArea);
        sendKeysMethod(editFirstNameTextArea,dieticianName);
    }

    @FindBy(id = "lastName")
    private WebElement editLastNameTextArea;
    public void changeDieticainLastName(String dieticianLastName){
        clearInsideTextArea(editLastNameTextArea);
        sendKeysMethod(editLastNameTextArea,dieticianLastName);
    }

    @FindBy(id = "bio")
    private WebElement editDieticianBioTextArea;
    public void changeDieticianBio(String dieticianBio){
        clearInsideTextArea(editDieticianBioTextArea);
        sendKeysMethod(editDieticianBioTextArea,dieticianBio);
    }

    @FindBy(id = "rating")
    private WebElement editDieticianRatingTextArea;
    public void changeDieticianRating(String dieticianRating){
        clearInsideTextArea(editDieticianRatingTextArea);
        sendKeysMethod(editDieticianRatingTextArea,dieticianRating);
    }

    @FindBy(id = "submit")
    private WebElement editDieticianButtonInEditPage;
    public void clickOnEditDieticianButoonInEditPage(){
        clickMethod(editDieticianButtonInEditPage);
    }

    @FindBy(xpath = "/html/body")
    private WebElement editDieticianConfirmMessageTextArea;
    public void checkEditDieticianConfirmMessage(String expectedConfirmMessage){
        Assertion(editDieticianConfirmMessageTextArea,expectedConfirmMessage);
    }

    @FindBy(xpath = "//*[@id='delete']")
    private WebElement deleteDieticianButton;
    public void clickOnDeleteDieticianButton(){
        clickMethod(deleteDieticianButton);
    }

    @FindBy(xpath = "/html/body")
    private WebElement deleteDieticianConfirmMessageTextArea;
    public void checkDeleteDieticianConfirmMessage(String expectedDeleteDieticianConfirmMessage){
        Assertion(deleteDieticianConfirmMessageTextArea,expectedDeleteDieticianConfirmMessage);
    }


}
