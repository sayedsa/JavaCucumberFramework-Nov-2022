package stepDefinitions;

import core.BaseClass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LoginPageObjects;

public class LoginSteps_Examples extends BaseClass {
	

	LoginPageObjects loginObj ;

	@When("user is in test homepage")
	public void user_is_in_test_homepage() {
		
	BaseClass.initializeDriver();
	
	}

	@When("user click on my account")
	public void user_click_on_my_account() {
		loginObj = new LoginPageObjects();
		loginObj.clickMyAccount();
		
		
	}

	@When("user enter {string} and {string}")
	public void user_enter_and(String username, String password) {
		loginObj.enterUserName(username);
		loginObj.enterPassword(password);
	}

	@When("click on login button")
	public void click_on_login_button() {
		loginObj.clickLogin();
	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {
		
	}
}
