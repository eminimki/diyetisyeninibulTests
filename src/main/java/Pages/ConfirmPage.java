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

    @FindBy(id = "completed")
    private WebElement orderCompleteMessageTextArea;
    public void checkOrderCompleteMessage(String expectedCompleteMessage){
        Assertion(orderCompleteMessageTextArea,expectedCompleteMessage);
    }

    @FindBy(id = "login")
    private WebElement orderCompleteNextButton;
    public void clickOnOrderCompleteNextButton(){
        clickMethod(orderCompleteNextButton);
    }

    @FindBy(id = "rating")
    private WebElement ratingTextArea;
    public void typeRating(String rating){
        clearInsideTextArea(ratingTextArea);
        sendKeysMethod(ratingTextArea,rating);
    }

    @FindBy(id = "update")
    private WebElement ratingSaveButton;
    public void clickOnRatingSaveButton(){
        clickMethod(ratingSaveButton);
    }

    @FindBy(xpath = "/html/body/div/div/div/table/tbody/tr[1]/td[5]")
    private WebElement awerageRatingTextArea;
    public void checkAwerageRating(String expectedRating){
        Assertion(awerageRatingTextArea,expectedRating);
    }


}
