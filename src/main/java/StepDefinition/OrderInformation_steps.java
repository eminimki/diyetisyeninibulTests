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
        System.out.println("TEST PASSED");
        Driver.closeDriver();
    }

    @When("check order information message {string} in complete test")
    public void check_order_information_message(String expected) {
        confirmPage.checkOrderconfirmMessage(expected);
    }

    @Then("check order completed message {string}")
    public void check_order_completed_message(String completedVerifyMessage) {
        confirmPage.checkOrderCompleteMessage(completedVerifyMessage);
    }
    @Then("click on next button in completed page")
    public void click_on_next_button_in_completed_page() {
        confirmPage.clickOnOrderCompleteNextButton();
    }
    @Then("check navigate to select dietician menu page with url {string} expected {string}")
    public void check_navigate_to_select_dietician_menu_page_with_url(String selectPageUrl, String expected) {
        confirmPage.checkExpectedStatus(confirmPage.checkURL(selectPageUrl),expected);
        Driver.closeDriver();
    }

}
