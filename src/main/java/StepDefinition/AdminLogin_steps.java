package StepDefinition;

import Pages.LoginPage;
import Utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AdminLogin_steps {
    LoginPage loginPage = new LoginPage();
    @When("click on admin button")
    public void click_on_admin_button() {
        loginPage.clickOnAdminButton();
    }
    @Then("check admin panel url {string}")
    public void check_admin_panel(String expected) {
        loginPage.checkURLVerify(expected);
        Driver.closeDriver();
    }
}
