package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {
	 @Given("User navigates to Login page")
	    public void user_navigates_to_login_page() {
	        System.out.println("User navigated to Login page");
	    }

	    @When("User enters valid email address {string}")
	    public void user_enters_valid_email_address(String email) {
	        System.out.println("User entered valid email address: " + email);
	    }

	    @When("User enters valid password {string}")
	    public void user_enters_valid_password(String password) {
	        System.out.println("User entered valid password: " + password);
	    }

	    @When("User clicks on Login button")
	    public void user_clicks_on_login_button() {
	        System.out.println("User clicked on Login button");
	    }

	    @Then("User should login successfully")
	    public void user_should_login_successfully() {
	        System.out.println("User logged in successfully");
	    }

	    @When("User enters invalid email address {string}")
	    public void user_enters_invalid_email_address(String email) {
	        System.out.println("User entered invalid email address: " + email);
	    }

	    @When("User enters invalid password {string}")
	    public void user_enters_invalid_password(String password) {
	        System.out.println("User entered invalid password: " + password);
	    }

	    @Then("User login should get a proper warning message")
	    public void user_login_should_get_a_proper_warning_message() {
	        System.out.println("Warning message displayed");
	    }

	    @Then("User should get a proper warning message")
	    public void user_should_get_a_proper_warning_message() {
	        System.out.println("Proper warning message displayed");
	    }

	    @When("User does not enter any credentials")
	    public void user_does_not_enter_any_credentials() {
	        System.out.println("User did not enter any credentials");
	    }
}
