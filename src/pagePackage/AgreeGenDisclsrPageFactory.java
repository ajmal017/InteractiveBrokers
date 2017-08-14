
package pagePackage;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

	/****************************
	 * AgreeGenDisclsrPage
	 */
public class AgreeGenDisclsrPageFactory {
	
	WebDriver driver;
	
	@FindBy (xpath = "//a[@href = 'Registration_v2.formSampleView?ad=day_trading_risk_disclosure.html']")
	WebElement dayTradRiskDiscStat;

	@FindBy (css = "input#final4019")
	WebElement agreeCFTCbRadioButton;

	@FindBy (css = "input#final4002")
	WebElement agreeCFTCAppndxARadioButton;

	@FindBy (css = "input#final4013")
	WebElement agreeFBERiskDiscRadioButton;

	@FindBy (css = "input#final4009")
	WebElement agreeIDARiskDiscRadioButton;

	@FindBy (css = "input#final4003")
	WebElement agreeOCCRiskDiscRadioButton;

	@FindBy (css = "input#final4010")
	WebElement agreeSSFRiskDiscRadioButton;

	@FindBy (css = "input#final3085")
	WebElement agreeMexStckRiskDiscRadioButton;

	@FindBy (css = "input#final3104")
	WebElement agreeNASDAQRadioButton;

	@FindBy (css = "input#signature0")
	WebElement eSignText1;

	@FindBy (css = "a#continueID.button.continue")
	WebElement saveContinueButton;

	public AgreeGenDisclsrPageFactory(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);  //initiates all the elements
	}
	
	public boolean isPresentDayTradRiskDiscStat(){
		if(dayTradRiskDiscStat.isDisplayed()){
			System.out.println("Element is Present");
			return true;
		} else{
			System.out.println("Element is Not Present");
			return false;
		}
	}
	
	public void clickAgreeCFTCbRadioBtn(){
		agreeCFTCbRadioButton.click();
	}
	
	public void clickAgreeCFTCAppndxARadioBtn(){
		agreeCFTCAppndxARadioButton.click();
	}
	
	public void clickAgreeFBERiskDiscRadioBtn(){
		agreeFBERiskDiscRadioButton.click();
	}

	public void clickAgreeIDARiskDiscRadioBtn(){
		agreeIDARiskDiscRadioButton.click();
	}

	public void clickAgreeOCCRiskDiscRadioBtn(){
		agreeOCCRiskDiscRadioButton.click();
	}
	
	public void clickAgreeSSFRiskDiscRadioBtn(){
		agreeSSFRiskDiscRadioButton.click();
	}
	
	public void clickMexStckRiskDiscRadioBtn(){
		agreeMexStckRiskDiscRadioButton.click();
	}

	public void clickNASDAQRadioBtn(){
		agreeNASDAQRadioButton.click();
	}
	
	public void fillESign1(String sign){
		eSignText1.sendKeys(sign);
	}
	 
	public void clickSaveContBtn(){
		saveContinueButton.click();
	}
	//Click Save and Continue Button
}
	


	
