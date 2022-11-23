package Pages;

import Utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminPage extends AbstractClass{
    WebDriver driver;
    public AdminPage() {
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@class= 'table table-striped table-hover table-bordered']")
    private WebElement dieticianTable;
    public void checkAdminSeeDieticianTable(){
        if (checkSeeElement(dieticianTable)){
            System.out.println("TEST PASSED");
        }else{System.out.println("TEST FAILED");}
    }

    @FindBy(xpath = "/html/body/div/div/div/a")
    private WebElement addDieticianButton;
    public void clickOnAddDieticianButton(){
        clickMethod(addDieticianButton);
    }

    @FindBy(id = "edit")
    private WebElement dieticianEditButtonInAdminPage;
    public void clickOnDieticianEditButtonInAdminPage(){
        clickMethod(dieticianEditButtonInAdminPage);
    }


}
