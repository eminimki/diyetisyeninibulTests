package StepDefinition;

import Pages.AddDieticianPage;
import Pages.AdminPage;
import Pages.EditDieticianPage;
import Pages.EditMealsPage;
import Utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AdminPage_steps {
    AdminPage adminPage = new AdminPage();
    AddDieticianPage addDieticianPage = new AddDieticianPage();
    EditDieticianPage editDieticianPage = new EditDieticianPage();

    @Given("click on new dietician button")
    public void click_on_new_dietician_button() {
        adminPage.clickOnAddDieticianButton();
    }

    @Given("type dietician name {string}")
    public void type_dietician_name(String dieticianName) {
        addDieticianPage.typeDieticianName(dieticianName);
    }

    @Given("type dietician last name {string}")
    public void type_dietician_last_name(String dieticianLastName) {
        addDieticianPage.typeDieticianLastName(dieticianLastName);
    }

    @Given("type dietician bio {string}")
    public void type_dietician_bio(String dieticianBio) {
        addDieticianPage.typeDieticianBio(dieticianBio);
    }

    @Given("type dietician rating {string}")
    public void type_dietician_rating(String dieticianRating) {
        addDieticianPage.typeDieticianRating(dieticianRating);
    }

    @When("click on dietician add button")
    public void click_on_dietician_add_button() {
        addDieticianPage.clickOnAddDieticianButton();
    }

    @Then("check add dietician confirm message {string}")
    public void check_add_dietician_confirm_message(String addDieticianConfirmMessage) {
        addDieticianPage.checkAddDieticianConfirmMessage(addDieticianConfirmMessage);
        Driver.closeDriver();
    }

    @Given("click on dietician edit button in admin page")
    public void click_on_dietician_edit_button_in_admin_page() {
        adminPage.clickOnDieticianEditButtonInAdminPage();
    }

    @Given("change dietician name {string}")
    public void change_dietician_name(String dieticianName) {
        editDieticianPage.changeDieticianName(dieticianName);
    }

    @Given("change dietician last name {string}")
    public void change_dietician_last_name(String dieticianLastName) {
        editDieticianPage.changeDieticainLastName(dieticianLastName);
    }

    @Given("change dietician bio {string}")
    public void change_dietician_bio(String dieticianBio) {
        editDieticianPage.changeDieticianBio(dieticianBio);
    }

    @Given("change dietician rating {string}")
    public void change_dietician_rating(String dieticianRating) {
        editDieticianPage.changeDieticianRating(dieticianRating);
    }

    @When("click on dietician edit button in edit page")
    public void click_on_dietician_edit_button_in_edit_page() {
        editDieticianPage.clickOnEditDieticianButoonInEditPage();
    }

    @Then("check edit dietician confirm message {string}")
    public void check_edit_dietician_confirm_message(String expectedConfirmMessage) {
        editDieticianPage.checkEditDieticianConfirmMessage(expectedConfirmMessage);
        Driver.closeDriver();
    }

    @When("click on dietician delete button")
    public void click_on_dietician_delete_button() {
        editDieticianPage.clickOnDeleteDieticianButton();
    }
    @Then("check dietician delete confirm message {string}")
    public void check_dietician_delete_confirm_message(String expectedDeleteDieticianConfirmMessage) {
        editDieticianPage.checkDeleteDieticianConfirmMessage(expectedDeleteDieticianConfirmMessage);
        Driver.closeDriver();
    }




}
