
package pagePackage;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

	/****************************
	 * AgreeNASDBTDSPage
	 */

public class AgreeNASDBTDSPageFactory {
	
	WebDriver driver;

	@FindBy (xpath = "//input[@name= 'signatures']")
	WebElement eSignText4;
	
	@FindBy (css = "input#bysignatures0")
	WebElement eSignSubscrText;

	@FindBy (css = "a#continueID.button.continue")
	WebElement saveContinueButton;
	
	public AgreeNASDBTDSPageFactory(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);  //initiates all the elements
	}
	
	public void fillESign4(String sign){
		eSignText4.sendKeys(sign);
	}
	
	public void fillESignSubscr(String subSign){
		eSignSubscrText.sendKeys(subSign);
	}
	
	public void clickSaveContBtn(){
		saveContinueButton.click();
	}
	//Click Save and Continue Button
}
	


	
