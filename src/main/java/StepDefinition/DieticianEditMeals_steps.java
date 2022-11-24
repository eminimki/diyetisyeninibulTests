package StepDefinition;

import Pages.DieticianLoginPage;
import Pages.EditMealsPage;
import Pages.LoginPage;
import Utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DieticianEditMeals_steps {
    LoginPage loginPage = new LoginPage();
    DieticianLoginPage dieticianLoginPage = new DieticianLoginPage();
    EditMealsPage editMealsPage = new EditMealsPage();


    @Given("click on dietician button")
    public void click_on_dietician_button() {
        loginPage.clickOnDieticianButton();
    }

    @Given("type dietician email {string}")
    public void type_dietician_email(String dieticianEmail) {
        dieticianLoginPage.sendDieticianEmail(dieticianEmail);
    }

    @Given("type dietician password {string}")
    public void type_dietician_password(String dieticianPassword) {
        dieticianLoginPage.sendDieticianPassword(dieticianPassword);
    }

    @Given("click dietician login button")
    public void click_dietician_login_button() {
        dieticianLoginPage.clickOnDieticianLoginButton();
    }

    @Given("change breakfast {string}")
    public void type_breakfast(String breakfast) {
        editMealsPage.sendBreakfast(breakfast);
    }

    @Given("change lunch {string}")
    public void type_lunch(String lunch) {
        editMealsPage.sendLunch(lunch);
    }
    @Given("change dinner {string}")
    public void type_dinner(String dinner) {
        editMealsPage.sendDinner(dinner);
    }
    @When("click on edit button")
    public void click_on_edit_button() {
        editMealsPage.clickOnEditMealsButton();
    }
    @Then("check edit meals confirm message {string}")
    public void check_confirm_message(String confirmMessage) {
        editMealsPage.checkConfirmMessage(confirmMessage);
        Driver.closeDriver();
    }

    @And("upload breakfast photo {string}")
    public void uploadBreakfastPhoto(String breakfastPhotoPath) {
        editMealsPage.uploadBreakfastPhoto(breakfastPhotoPath);
    }

    @And("upload lunch photo {string}")
    public void uploadLunchPhoto(String lunchPhotoPath) {
        editMealsPage.uploadLunchPhoto(lunchPhotoPath);
    }

    @And("upload dinner photo {string}")
    public void uploadDinnerPhoto(String dinnerPhotoPath) {
        editMealsPage.uploadDinnerPhoto(dinnerPhotoPath);
    }
}
