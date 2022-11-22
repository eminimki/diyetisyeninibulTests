package StepDefinition;

import Pages.ConfirmPage;
import Pages.MealsPage;
import Pages.SelectPage;
import Utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrderInformation_steps {
    SelectPage selectPage = new SelectPage();
    MealsPage mealsPage = new MealsPage();
    ConfirmPage confirmPage = new ConfirmPage();
    @Given("choose a dietician")
    public void choose_a_dietician() {
        selectPage.clickOnFirstDieticianButton();
    }
    @Given("choose a meal")
    public void choose_a_meal() {
        mealsPage.clickOnLunchCheckbox();
    }
    @When("confirm meal")
    public void confirm_meal() {
        mealsPage.clickOnConfirmMealsButton();
    }
    @Then("check order information message {string}")
    public void check_order_information_url(String expected) {
        confirmPage.checkOrderconfirmMessage(expected);
        Driver.closeDriver();
    }
}
