package stepdefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Search {
	
	@Before
	public void setup() {
		System.out.println("Browser got open");
	}
	
	@After
	public void closeDown() {
		System.out.println("Browser got close");
	}
	@Given("User opens the Application")
	public void user_opens_the_application() {
	    System.out.println("Application got Open");
	}

	@When("User enters valid product into Search field")
	public void user_enters_valid_product_into_search_field() {
	   System.out.println("Valid Product got Enter");
	}

	@When("User clicks on Search button")
	public void user_clicks_on_search_button() {
	   System.out.println("User Click on Search Button");
	}

	@Then("Valid Product should get displayed in search results")
	public void valid_product_should_get_displayed_in_search_results() {
	   System.out.println("Valid Product get Displayed ");
	}

	@Given("USer open the Application")
	public void u_ser_open_the_application() {
	   
	}

	@When("User enter non-existing product into Search field")
	public void user_enter_non_existing_product_into_search_field() {
		System.out.println("User entered non-existing product into Search field"); 
	}

	@When("User click on Search button")
	public void user_click_on_search_button() {
	   
	}

	@Then("Proper text informing the User about no product matching should be displayed")
	public void proper_text_informing_the_user_about_no_product_matching_should_be_displayed() {
	   
	}

	@When("User dont enter any product into Search field")
	public void user_dont_enter_any_product_into_search_field() {
	    
	}


}
