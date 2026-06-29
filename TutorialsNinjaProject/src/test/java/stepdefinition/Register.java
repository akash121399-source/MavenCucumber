package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Register {
	

    @When("User enters firstname {string} into the First Name field")
    public void user_enters_firstname(String firstname) {
        System.out.println(firstname);
    }

    @When("User enters lastname {string} into the Last Name field")
    public void user_enters_lastname(String lastname) {
        System.out.println(lastname);
    }

    @When("User enters email address {string} into the Email field")
    public void user_enters_email(String email) {
        System.out.println(email);
    }

    
    @When("User enters password {string} into the Password Confirm field")
    public void user_enters_password_into_the_password_confirm_field(String password) {
        System.out.println("User entered password into Password Confirm field: " + password);
    }

    @When("User selects Privacy Policy field")
    public void user_selects_privacy_policy() {
        System.out.println("Privacy selected");
    }

    @When("User clicks on Continue button")
    public void user_clicks_continue_button() {
        System.out.println("Continue clicked");
    }

    @Then("Account should get successfully created")
    public void account_should_get_successfully_created() {
        System.out.println("Account created");
    }
    @When("User enters phone number {string} into the Phone field")
    public void user_enters_phone_number_into_the_phone_field(String phone) {
        System.out.println("User entered phone number: " + phone);
    }

    @When("User selects Yes for Newsletter")
    public void user_selects_yes_for_newsletter() {
        System.out.println("User selected Yes for Newsletter");
    }

    @Then("Warning message informing the User about duplicate email should be displayed")
    public void warning_message_informing_the_user_about_duplicate_email_should_be_displayed() {
        System.out.println("Duplicate email warning displayed");
    }
    
    @When("User enters password {string} into the Password field")
    public void user_enters_password_into_the_password_field(String password) {
        System.out.println("User entered password: " + password);
    }
    
    @Given("User navigates to Register Account page")
    public void user_navigates_to_register_account_page() {
        System.out.println("User navigated to Register Account page");
    }
    
    @When("User does not enter details into any fields")
    public void user_does_not_enter_details_into_any_fields() {
        System.out.println("User did not enter details into any fields");
    }
    
    @Then("Warning messages should be displayed for the mandatory fields")
    public void warning_messages_should_be_displayed_for_the_mandatory_fields() {
        System.out.println("Warning messages displayed for mandatory fields");
    }
    

}
