package StepDefinition;

import Pages.AdminPage;
import Pages.LoginPage;
import Utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AdminLogin_steps {
    LoginPage loginPage = new LoginPage();
    AdminPage adminPage = new AdminPage();
    @When("click on admin button")
    public void click_on_admin_button() {
        loginPage.clickOnAdminButton();
    }
    @Then("check admin see dietician")
    public void check_admin_panel() {
        adminPage.checkAdminSeeDieticianTable();
    }
}
