
package pagePackage;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

	/****************************
	 * AgreeSecureLoginSysPage
	 */

public class AgreeSecureLoginSysPageFactory {
	
	WebDriver driver;
	
	@FindBy (css = "a#activateNID.button.continue")
	WebElement doNotActButton;

	public AgreeSecureLoginSysPageFactory(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);  //initiates all the elements
	}
	
	public void clickDoNotActBtn(){
		doNotActButton.click();
	}
	//Click Do Not Act Button
}
	


	
