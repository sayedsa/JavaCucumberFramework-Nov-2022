package stepDefinitions;

import core.BaseClass;
import io.cucumber.java.en.*;
import pageObjects.RegisterAccountPageObjects;

public class RegisterAccountSteps_simple extends BaseClass {
	
	RegisterAccountPageObjects RegisterObj = new RegisterAccountPageObjects();
	
	
	
	@Given("User is on TEST Environment page")
	public void user_is_on_test_environment_page() {
	    BaseClass.initializeDriver();
	
	    
	 
	}

	@When("User clicks on MyAccount")
	public void user_clicks_on_my_account() {
		RegisterObj.clickOnMyAccount();
		
	logger.info("user clicked on my account");
	
	}

	@When("User enters his name {string}")
	public void user_enters_his_name(String name) {
		RegisterObj.enterName(name); 
		
		logger.info("user entered userName");
	}

	@When("User enters cityname  {string}")
	public void user_enters_cityname(String city) {
		RegisterObj.enterCity(city);
		logger.info("user entered city");
		
	}

	@When("User enters address {string}")
	public void user_enters_address(String address) {
		RegisterObj.enterAddress(address); 
		logger.info("user entered address");
	}

	@When("User enters email address {string}")
	public void user_enters_email_address(String email) {
		RegisterObj.enterEmail(email); 
		
		logger.info("user entered email");
	}

	@When("User enters password {string}")
	public void user_enters_password(String password) {
		RegisterObj.enterPassword(password);
	}

	@Then("User click registerButton")
	public void user_click_register_button() {
		RegisterObj.clickRegisterBttn();
	}
}
