package Pages;

import Utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.time.Duration;

public abstract class AbstractClass {
    private WebDriver driver = Driver.getDriver();
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

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
            return "PASSED";
        }else {
            waitASecond();
            return "FAILED";
        }

    }
    public void waitASecond(){
        try {
            Thread.sleep(250); // sleep/stop a thread for 1 second
        } catch(InterruptedException e) {
            System.out.println("An Excetion occured: " + e);
        }
    }

    public void checkExpectedStatus(String expected, String actual){
        if (expected.equals(actual)){
            System.out.println("TEST PASSED");
        }else{
            System.out.println("TEST FAILED");
        }
        Driver.closeDriver();
    }

    public void Assertion(WebElement actual, String expected){
        wait.until(ExpectedConditions.visibilityOf(actual));
        Assert.assertEquals(actual.getText(),expected);
        System.out.println("TEST PASSED");
    }

    public boolean checkSeeElement(WebElement webElement){
        wait.until(ExpectedConditions.visibilityOf(webElement));
        return true;
    }
}
