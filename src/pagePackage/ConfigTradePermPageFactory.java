package pagePackage;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

	/****************************
	 * ConfigTradePermPage
	 */
public class ConfigTradePermPageFactory {
	
	WebDriver driver;

	@FindBy (xpath = "//a[@id='continueID']")
	WebElement continueButton;
	
	@FindBy (xpath = "//tr[@region='North America']//input[@id='checkAll']")
	java.util.List<WebElement> els;
	
	@FindBy (xpath = "//input[@name = 'agrees' and @value = 'F']")
	WebElement profRadioButton;
	
	@FindBy (css = "#continueID")
	WebElement saveContinueButton;

	public ConfigTradePermPageFactory(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);  //initiates all the elements
	}

	public void clickCheckBoxNA(){
		
	for ( WebElement el : els ) {
	    if ( !el.isEnabled() ) { 
	    	el.click();
	    }
	}
	
	}
	//Checks all the Check Boxes under North America
	
	public void clickContinue(){
		continueButton.click();
	}	
	//Clicks the continue button
	
	public void clickProfRadioBtn(){
		profRadioButton.click();
	}	
	//Clicks the Professional Radio button
	
	public void clickSaveContBtn(){
		saveContinueButton.click();
	}
	//Click Save and Continue Button
}
	


	
