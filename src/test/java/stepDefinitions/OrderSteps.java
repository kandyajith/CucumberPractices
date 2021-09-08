package stepDefinitions;

import io.cucumber.java.en.*;

public class OrderSteps 
{
	
	@Given("a registed user exists")
	public void a_registed_user_exists() {
		System.out.println("step 1: a registed user exist");
	}

	@Given("user is on Amason login page")
	public void user_is_on_amason_login_page() {
		System.out.println("step 2: user is on Amason login page");
	}

	@When("user enters username")
	public void user_enters_username() {
		System.out.println("step 3: user enters username");
	}

	@When("user enters password")
	public void user_enters_password() {
		System.out.println("step 4: user enters password");
	}

	@When("user click on login button")
	public void user_click_on_login_button() {
		System.out.println("step 5: user click on login button");
	}

	@Then("user navigates to orger page")
	public void user_navigates_to_orger_page() {
		System.out.println("step 6: user navigates to orger page");
	}

	@When("user clicks on Order link")
	public void user_clicks_on_order_link() {
		System.out.println("step 7: user clicks on Order link");
	}

	@Then("user checks the previous order details")
	public void user_checks_the_previous_order_details() {
		System.out.println("step 8: user checks the previous order details");
	}

	@When("user clicks on open Order link")
	public void user_clicks_on_open_order_link() {
		System.out.println("step 9: user clicks on open Order link");
	}

	@Then("user checks the open order details")
	public void user_checks_the_open_order_details() {
		System.out.println("step 10: user checks the open order details");
	}

	@When("user clicks on cancelled Order link")
	public void user_clicks_on_cancelled_order_link() {
		System.out.println("step 11: user clicks on cancelled Order link");
	}

	@Then("user checks the cancelled order details")
	public void user_checks_the_cancelled_order_details() {
		System.out.println("step 12: user checks the cancelled order details");
	}


}
