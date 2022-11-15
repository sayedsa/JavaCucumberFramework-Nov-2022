package stepDefinitions;

import core.BaseClass;
import io.cucumber.java.en.*;
import pageObjects.LoginPageObjects;

public class LoginSteps_Simple extends BaseClass {
	LoginPageObjects loginObj = new LoginPageObjects();

	@Given("user is on test Environment page")
	public void user_is_on_test_environment_page() {
		BaseClass.initializeDriver();
		logger.info("first step");
	}

	@When("user clicks on myAccount")
	public void user_clicks_on_my_account() {
		loginObj.clickMyAccount();
	}
	@When("user enters userName {string} and passWord {string}")
	public void user_enters_user_name_and_pass_word(String Username, String password) {
	
		loginObj.enterUserName(Username);
		loginObj.enterPassword(password);
	}

	@When("user clicks on login button")
	public void user_clicks_on_login_button() {
		loginObj.clickLogin();
	}

}
