package pagePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

	/****************************
	 * LoginPage
	 */
public class LoginPageFactory {
	
	WebDriver driver;
	
	@FindBy(xpath="//input[@id='user_name']")
	WebElement userName;
	
	@FindBy(xpath="//input[@id='password']")
	WebElement password;
	
	@FindBy(xpath="//table[@id='authtable']//td/input[@id='submitForm']")
	WebElement logInButton;

	public LoginPageFactory(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);  //initiates all the elements
	}

	public void clickUserNameField(){
		userName.click();
	}
//	clicks on User Name Text Box
	
	public void clickPasswordField(){
		password.click();
	}
//	clicks on Password Text Box
	
	public void fillUserName(String userKey){
		userName.sendKeys(userKey);
	}
	
//	Enters UserName

	public void fillPassword(String passwordKey){
		password.sendKeys(passwordKey);
	}
	
//	Enters Password
	
	public void clickLogIn(){
		logInButton.click();
	}
	
//	Logs into the application
	}
