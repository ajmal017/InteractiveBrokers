package pagePackage;

import static org.junit.Assert.*;

import java.awt.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

	/****************************
	 * AgreeCustConsentPage
	 */
public class AgreeCustConsentPageFactory {
	
	WebDriver driver;
	
	@FindBy (xpath = "//input[@name = 'agree1' and @value = 'T']")
	WebElement acceptMFIERadioButton;

	@FindBy (xpath = "//input[@name = 'agree2' and @value = 'T']")
	WebElement acceptRDGRadioButton;

	@FindBy (css = "a#continueID.button.continue")
	WebElement saveContinueButton;

	
	public AgreeCustConsentPageFactory(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);  //initiates all the elements
	}
	
	public void clickAcceptMFIERadioBtn(){
		acceptMFIERadioButton.click();
	}
	public void clickAcceptRDGRadioBtn(){
		acceptRDGRadioButton.click();
	}
	
	public void clickSaveContBtn(){
		saveContinueButton.click();
	}
	//Click Save and Continue Button
}
	


	
