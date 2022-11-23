package StepDefinition;

import Pages.ConfirmPage;
import Utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Rating_steps {
    ConfirmPage confirmPage = new ConfirmPage();

    @Given("type rating {string} for dietician")
    public void type_rating_for_dietician(String rating) {
        confirmPage.typeRating(rating);
    }
    @Given("click rate save button")
    public void click_rate_save_button() {
        confirmPage.clickOnRatingSaveButton();
        Driver.closeDriver();
    }

    @Then("check dietician awarage rating {string}")
    public void check_dietician_awarage_rating(String expectedRating) {
        confirmPage.checkAwerageRating(expectedRating);
        Driver.closeDriver();
    }
}
