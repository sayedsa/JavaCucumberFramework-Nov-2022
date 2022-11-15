package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import core.BaseClass;



public class LoginPageObjects extends BaseClass{
	
	
	
	public LoginPageObjects() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	
	@FindBy(how = How.XPATH,using = "//*[@id=\"Top_bar\"]/div/div/div[2]/div/a[4]")
	private WebElement myAccount;            
	
	
	@FindBy(id ="username")
	private WebElement userName;				
	
	
	@FindBy(id="password")
	private WebElement Password;
	
	@FindBy(name="login")
	private WebElement bttn_login;
 
	

	public void clickMyAccount() {
	myAccount.click();
	}
	
	public void enterUserName(String username) {
		userName.sendKeys(username);
	}
	
	public void enterPassword(String password) {
		Password.sendKeys(password);
	}
	
	public void clickLogin() {
		
		bttn_login.click();
	}
}