package Pages;

import Utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.time.Duration;

public abstract class AbstractClass {
    private WebDriver driver = Driver.getDriver();
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    public void clickMethod(WebElement clickElement){
        wait.until(ExpectedConditions.elementToBeClickable(clickElement));
        clickElement.click();
        waitASecond();

    }

    public void sendKeysMethod(WebElement sendKeysElement, String text){
        wait.until(ExpectedConditions.visibilityOf(sendKeysElement));
        sendKeysElement.sendKeys(text);
        waitASecond();
    }

    public void selectElementFromDropdownMenu(WebElement dropdownMenu , String select ){
        Select slc = new Select(dropdownMenu);
        slc.selectByVisibleText(select);
        waitASecond();
    }
    public String checkURL(String expected){
        if (expected.equals(driver.getCurrentUrl())){
            waitASecond();
            return "TEST PASSED";
        }else {
            waitASecond();
            return "TEST FAILED";
        }

    }
    public void waitASecond(){
        try {
            Thread.sleep(1000); // sleep/stop a thread for 1 second
        } catch(InterruptedException e) {
            System.out.println("An Excetion occured: " + e);
        }
    }

    public void checkExpextedStatus(String expected, String actual){
        if (expected.equals(actual)){
            System.out.println("TEST PASSED");
        }else{
            System.out.println("TEST FAILED");
        }
    }
}
