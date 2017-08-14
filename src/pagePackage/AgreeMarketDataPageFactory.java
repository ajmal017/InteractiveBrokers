
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
	 * AgreeMarketDataPage
	 */
public class AgreeMarketDataPageFactory {
	
	WebDriver driver;

	@FindBy (css = "input#signature0")
	WebElement eSignText2;

	@FindBy (css = "a#continueID.button.continue")
	WebElement saveContinueButton;

	
	public AgreeMarketDataPageFactory(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);  //initiates all the elements
	}
	
	public void fillESign2(String sign){
		eSignText2.sendKeys(sign);
	}
	
	public void clickSaveContBtn(){
		saveContinueButton.click();
	}
	//Click Save and Continue Button
}
	


	
