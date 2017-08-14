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
	 * ConfigPricingStrucPage
	 */
public class ConfigPricingStrucPageFactory {
	
	WebDriver driver;
	
	@FindBy (xpath = "//input[@reqmsg = 'stkCommissionScheduleReq' and @value = '0']")
	WebElement stocksFixedRadioButton;

	@FindBy (xpath = "//input[@reqmsg = 'comCommissionScheduleReq' and @value = '0']")
	WebElement futuresFixedRadioButton;

	@FindBy (css = "a#continueID.button.continue")
	WebElement saveContinueButton;


	public ConfigPricingStrucPageFactory(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);  //initiates all the elements
	}
	
	public void clickStocksFixedRadioBtn(){
		stocksFixedRadioButton.click();
	}	
	//Clicks stocksFixedRadioButton
	
	public void clickFutrFixedRadioBtn(){
		futuresFixedRadioButton.click();
	}	
	//Clicks futuresFixedRadioButton
	
	public void clickSaveContBtn(){
		saveContinueButton.click();
	}
	//Click Save and Continue Button
}
	


	
