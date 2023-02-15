package Stepdefiniton;

import cucumber.api.java.en.*;

public class loginsteps {
	
	//WebDriver driver;
	//loginpg l;
	@Given("^User is on login page$")
	public void user_is_on_login_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("login");
	}

	@When("^User enter username and password$")
	public void user_enter_username_and_password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("login");
	}

	@When("^Clicks on the login button$")
	public void clicks_on_the_login_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("login");
	}

	@Then("^User navigated to home page$")
	public void user_navigated_to_home_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("login success");
	}


}
