
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
	 * ConfigMDSubscrpPage
	 */
public class ConfigMDSubscrpPageFactory {
	
	WebDriver driver;
	
	@FindBy (css = ".col_left>ul>li>span>input[type = 'checkbox'] , .col_middle>ul>li>span>input[type = 'checkbox']")
	java.util.List<WebElement> checkBoxesNA1;
	

	@FindBy (css = "a#activateNID.button.continue")
	WebElement saveAndContinue;
	
	public ConfigMDSubscrpPageFactory(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);  //initiates all the elements
	}
	
	public String getPageTitle(){
		return driver.getTitle();
	}
	//returns the page title
	
	public void clickCheckBoxNA1(){
		for ( WebElement el1 : checkBoxesNA1 ) {
		    if ( !el1.isDisplayed() ) { 
		    	el1.click();
		    }
		}
	}

	public void clickSaveContinue(){	
		saveAndContinue.click();
	}
		
	//Click Save and Continue Button
		
	}
	


	
