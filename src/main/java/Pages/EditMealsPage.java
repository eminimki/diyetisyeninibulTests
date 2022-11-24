package Pages;

import Utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditMealsPage extends AbstractClass{
    WebDriver driver;
    public EditMealsPage() {
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "breakfast")
    private WebElement breakfastTextArea;
    public void sendBreakfast(String breakfast){
        clearInsideTextArea(breakfastTextArea);
        sendKeysMethod(breakfastTextArea,breakfast);
    }

    @FindBy(id = "lunch")
    private WebElement lunchTextArea;
    public void sendLunch(String luch){
        clearInsideTextArea(lunchTextArea);
        sendKeysMethod(lunchTextArea,luch);
    }

    @FindBy(id = "dinner")
    private WebElement dinnerTextArea;
    public void sendDinner(String dinner){
        clearInsideTextArea(dinnerTextArea);
        sendKeysMethod(dinnerTextArea,dinner);
    }

    @FindBy(id = "edit")
    private WebElement editButton;
    public void clickOnEditMealsButton(){
        clickMethod(editButton);
    }

    @FindBy(xpath = "//*[contains(text(),'Bilgiler güncellendi')]")
    private WebElement confirmMessageTextArea;
    public void checkConfirmMessage(String expectedConfirmMessage){
        Assertion(confirmMessageTextArea,expectedConfirmMessage);
    }

    @FindBy(name = "breakfastPhoto")
    private WebElement breakfastPhotoArea;
    public void uploadBreakfastPhoto(String breakfastPhotoPath){
        uploadFile(breakfastPhotoArea,breakfastPhotoPath);
    }

    @FindBy(name = "lunchPhoto")
    private WebElement lunchPhotoArea;
    public void uploadLunchPhoto(String lunchPhotoPath){
        uploadFile(lunchPhotoArea,lunchPhotoPath);
    }

    @FindBy(name = "dinnerPhoto")
    private WebElement dinnerPhotoArea;
    public void uploadDinnerPhoto(String dinnerPhotoPath){
        uploadFile(dinnerPhotoArea,dinnerPhotoPath);
    }

}
