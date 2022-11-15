package stepDefinitions;

import java.util.List;
import java.util.Map;
import io.cucumber.datatable.DataTable;

import core.BaseClass;
//import cucumber.api.DataTable;
import io.cucumber.java.en.*;
import pageObjects.RegisterAccountPageObjects;

public class LoginSteps_DataTable extends BaseClass {

	RegisterAccountPageObjects RegObject = new RegisterAccountPageObjects();

	@Given("user test Register funtionality using data table")
	public void user_test_register_funtionality_using_data_table() {
		BaseClass.initializeDriver();
		logger.info(getBrowserName());
		logger.info("it is the data table");
	}

	@When("user enters below information")
	public void user_enters_below_information(DataTable personalInfo) {
		/*	
		
		List<Map<String, String>> data = personalInfo.asMaps(String.class, String.class);
		RegObject.enterName(data.get(0).get("Name"));
		RegObject.enterCity(data.get(0).get("City"));
		RegObject.enterCity(data.get(0).get("State"));
		RegObject.enterEmail(data.get(0).get("Email"));
		RegObject.enterPassword(data.get(0).get("Password"));
		*/
		
		List<List<String>> data = personalInfo.asLists();

		RegObject.enterName(data.get(0).get(0));
		RegObject.enterCity(data.get(0).get(1));
		RegObject.enterAddress(data.get(0).get(2));
		RegObject.enterEmail(data.get(0).get(3));
		RegObject.enterPassword(data.get(0).get(4));

	}

	@Then("user clicks registerButton")
	public void user_clicks_register_button() {
		RegObject.clickRegisterBttn();

	}

}
