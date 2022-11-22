package StepDefinition;

import Pages.LoginPage;
import Utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class Login_steps {
    private WebDriver driver;
    LoginPage loginPage = new LoginPage();
    @Given("open login page")
    public void open_login_page() {
        driver= Driver.getDriver();
        driver.manage().window().maximize();
        driver.get("http://localhost:8080/login");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }
    @Given("type email {string}")
    public void type_e_mail(String emailText) {
        loginPage.emailSendKeys(emailText);
    }
    @Given("type password with valid password {string}")
    public void type_password_with_valid_password(String passwordText) {
        loginPage.passwordSendKeys(passwordText);
    }

    @Given("type credit card {string} info")
    public void type_credit_card_info(String creditCardText) {
        loginPage.cardNumberSendKeys(creditCardText);
    }

    @Given("type SKT {string}")
    public void type_skt(String sktText) {
        loginPage.sktSendKeys(sktText);
    }

    @Given("type CVV {string}")
    public void type_cvv(String cvvText) {
        loginPage.cvvSendKeys(cvvText);
    }

    @Given("type adress {string}")
    public void type_adress(String adressText) {
        loginPage.addressSendKeys(adressText);
    }

    @Given("type password confirm {string}")
    public void type_password_confirm(String validconfirmText) {
        loginPage.confirmSendKeys(validconfirmText);
    }

    @When("click on submit button")
    public void click_on_submit_button() {
        loginPage.clickSubmitButton();
    }

    @Then("check login status with url {string} and expected {string}")
    public void check_login_status(String expectedURL, String expected) {
        loginPage.checkExpectedStatus(loginPage.checkURL(expectedURL),expected);
    }

}
