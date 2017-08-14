
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
	 * AgreeAccSetUpPage
	 */

public class AgreeAccSetUpPageFactory {
	
	WebDriver driver;

	@FindBy (css = "a#continueID.button.continue")
	WebElement saveContinueButton;
	
	public AgreeAccSetUpPageFactory(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);  //initiates all the elements
	}
	
	public void clickSaveContBtn(){
		saveContinueButton.click();
	}
	//Click Save and Continue Button
}
	


	
