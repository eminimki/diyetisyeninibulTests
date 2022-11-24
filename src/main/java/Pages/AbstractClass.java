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
        waitASome(250);

    }

    public void sendKeysMethod(WebElement sendKeysElement, String text){
        wait.until(ExpectedConditions.visibilityOf(sendKeysElement));
        sendKeysElement.sendKeys(text);
        waitASome(250);
    }
/* dropdownmenu */
    public void selectElementFromDropdownMenu(WebElement dropdownMenu , String select ){
        Select slc = new Select(dropdownMenu);
        slc.selectByVisibleText(select);
        waitASome(250);
    }
    public String checkURL(String expectedURL){
        if (expectedURL.equals(driver.getCurrentUrl())){
            waitASome(250);
            return "PASSED";
        }else {
            waitASome(1000);
            return "FAILED";
        }

    }
    public void waitASome(int time){
        try {
            Thread.sleep(time); // sleep/stop a thread for 1 second
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
        waitASome(250);
    }

    public boolean checkSeeElement(WebElement webElement){
        wait.until(ExpectedConditions.visibilityOf(webElement));
        return true;
    }

    public void clearInsideTextArea(WebElement webElement){
        webElement.clear();
        waitASome(250);
    }

    public void uploadFile(WebElement webElement, String filePath){
        webElement.sendKeys(filePath);
        waitASome(250);
    }

}
