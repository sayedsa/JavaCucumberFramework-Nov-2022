package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import core.BaseClass;

public class RegisterAccountPageObjects extends BaseClass {

	

	public RegisterAccountPageObjects() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.XPATH, using = "//*[@id=\"Top_bar\"]/div/div/div[2]/div/a[4]")
	private WebElement myAccount;

	@FindBy(how = How.XPATH, using = "//input[@id='wpwc_custom_registration_field_125']")
	private WebElement enterName;

	@FindBy(how = How.XPATH, using = "//input[@id='wpwc_custom_registration_field_126']")
	private WebElement enterCity;

	@FindBy(how = How.XPATH, using = "//input[@name='wpwc_custom_registration_field_127']")
	private WebElement enterAddress;

	@FindBy(how = How.XPATH, using = "//input[@name='email']")
	private WebElement enterEmail;

	@FindBy(how = How.XPATH, using = "//input[@id='reg_password']")
	private WebElement enterPassword;

	@FindBy(how = How.XPATH, using = "//button[@name='register']")
	private WebElement clickRegisterBttn;

	public void clickOnMyAccount() {

		myAccount.click();

	}

	public void enterName(String name) {

		enterName.sendKeys(name);

	}

	public void enterCity(String city) {
		enterCity.sendKeys(city);

	}

	public void enterAddress(String address) {
		enterAddress.sendKeys(address);
	}

	public void enterEmail(String email) {
		enterEmail.sendKeys(email);
	}

	public void enterPassword(String password) {
		enterPassword.sendKeys(password);
	}

	public void clickRegisterBttn() {
		clickRegisterBttn.click();
	}
}