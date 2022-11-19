package Pages;

import Utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MealsPage extends AbstractClass {
    WebDriver driver;
    public MealsPage() {
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "lunch")
    private WebElement lunchCheckbox;
    public void clickOnLunchCheckbox(){
        clickMethod(lunchCheckbox);
    }

    @FindBy(id = "sec")
    private WebElement confirmMealsButton;
    public void clickOnConfirmMealsButton(){
        clickMethod(confirmMealsButton);
    }

}
