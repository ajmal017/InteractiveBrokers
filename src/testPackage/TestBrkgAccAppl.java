package testPackage;

import org.testng.annotations.Test;


import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


import pagePackage.LoginPageFactory;
import pagePackage.ConfigTradePermPageFactory;
import pagePackage.ConfigMDSubStatusPageFactory;
import pagePackage.ConfigMDSubscrpPageFactory;
import pagePackage.ConfigPricingStrucPageFactory;
import pagePackage.ConfigReviewPageFactory;
import pagePackage.AgreeCustConsentPageFactory;
import pagePackage.AgreeGenDisclsrPageFactory;
import pagePackage.AgreeMarketDataPageFactory;
import pagePackage.AgreeOnlineNASDAQPageFactory;
import pagePackage.AgreeNASDBTDSPageFactory;
import pagePackage.AgreeAccSetUpPageFactory;
import pagePackage.AgreeSecureLoginSysPageFactory;
import pagePackage.CompletePendReviewPageFactory;

public class TestBrkgAccAppl {
	private WebDriver driver; 
	private String baseUrl;
	LoginPageFactory LoginPage;
	ConfigTradePermPageFactory ConfigTradePermPage;
	ConfigMDSubStatusPageFactory ConfigMDSubStatusPage;
	ConfigMDSubscrpPageFactory ConfigMDSubscrpPage;
	ConfigPricingStrucPageFactory ConfigPricingStrucPage;
	ConfigReviewPageFactory ConfigReviewPage;
	AgreeCustConsentPageFactory AgreeCustConsentPage;
	AgreeGenDisclsrPageFactory AgreeGenDisclsrPage;
	AgreeMarketDataPageFactory AgreeMarketDataPage;
	AgreeOnlineNASDAQPageFactory AgreeOnlineNASDAQPage;
	AgreeNASDBTDSPageFactory AgreeNASDBTDSPage;
	AgreeAccSetUpPageFactory AgreeAccSetUpPage;
	AgreeSecureLoginSysPageFactory AgreeSecureLoginSysPage;
	CompletePendReviewPageFactory CompletePendReviewPage;
	
	@BeforeTest
	public void beforeMethod() throws Exception {
		driver = new ChromeDriver(); 
		baseUrl = "https://gdcdyn.interactivebrokers.com/sso/Login";//assigned baseUrl   
		LoginPage = new LoginPageFactory(driver);
		ConfigTradePermPage = new ConfigTradePermPageFactory (driver);
		ConfigMDSubStatusPage = new ConfigMDSubStatusPageFactory (driver);
		ConfigMDSubscrpPage = new ConfigMDSubscrpPageFactory (driver);
		ConfigPricingStrucPage = new ConfigPricingStrucPageFactory (driver);
		ConfigReviewPage = new ConfigReviewPageFactory (driver);
		AgreeCustConsentPage = new AgreeCustConsentPageFactory (driver);
		AgreeGenDisclsrPage = new AgreeGenDisclsrPageFactory (driver);
		AgreeMarketDataPage = new AgreeMarketDataPageFactory (driver);
		AgreeOnlineNASDAQPage = new AgreeOnlineNASDAQPageFactory(driver);
		AgreeNASDBTDSPage = new AgreeNASDBTDSPageFactory (driver);
		AgreeAccSetUpPage = new AgreeAccSetUpPageFactory (driver);
		AgreeSecureLoginSysPage = new AgreeSecureLoginSysPageFactory(driver);
		CompletePendReviewPage = new CompletePendReviewPageFactory(driver);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //implicit wait time 10 seconds
		driver.manage().window().maximize();// maximizes the window
		driver.get(baseUrl);//opens the baseUrl on the browser
	}
	/*
	 * Opens the browser and navigates to the Login Page
	 */
	
	@Test (priority=1)	
	public void test1() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		LoginPage.clickUserNameField();
		LoginPage.fillUserName("testsp201");
		LoginPage.clickPasswordField();
		LoginPage.fillPassword("tester1");
		LoginPage.clickLogIn();
	}
	/*
	 * Test Case 1: Logs into the Brokerage Account Application
	 * Task
	 *1) Select All products under North America
	 *2) Save and Continue
	 */
	
	@Test (priority=2)	
	public void test2() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		ConfigTradePermPage.clickCheckBoxNA();
		ConfigTradePermPage.clickContinue();
	}
	/*
	 * Test Case 2: Selects All products under North America and continue
	 */
	
	@Test (priority=3)	
	public void test3() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		ConfigMDSubStatusPage.clickProfRadioBtn();
		ConfigMDSubStatusPage.clickSaveContBtn();
	}
	/*
	 * Test Case 3: Click Radio Button and click save and continue
	 * Task
	 *1) Select Professional
	 *2) Save and Continue
	 */
	
	
	@Test (priority=4)	
	public void test4() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		ConfigMDSubStatusPage.clickSaveContBtn();
	}
	/*
	 * Test Case 4: Click save and continue in Trading configuration
	 * Task
	 *1) Save and Continue
	 */
	
	@Test (priority=5)	
	public void test5() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		String actualTitle = ConfigMDSubscrpPage.getPageTitle();
		System.out.println("Title of page is:" + actualTitle); 
		ConfigMDSubscrpPage.clickCheckBoxNA1();
		ConfigMDSubscrpPage.clickSaveContinue();
	}
	/*
	 * Test Case 5: 
	 *	Tasks:
	 *1) Get the page title
	 *2) Select all market data under North America tab
	 *3) Save and Continue
	 */
	
	@Test (priority=6)	
	public void test6() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		ConfigPricingStrucPage.clickStocksFixedRadioBtn();
		ConfigPricingStrucPage.clickFutrFixedRadioBtn();
		ConfigPricingStrucPage.clickSaveContBtn();
	}
	
	/*
	 * Test Case 6: 
	 *	Tasks:
	 *1) Choose ‘Fixed’ for both
	 *2) Save and Continue
	 */
	
	@Test (priority=7)	
	public void test7() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		ConfigReviewPage.clickSaveContBtn();
	}
	
	/*
	 * Test Case 7: 
	 *	Tasks:
	 *1) Save and Continue
	 */
	
	@Test (priority=8)	
	public void test8() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		AgreeCustConsentPage.clickAcceptMFIERadioBtn();
		AgreeCustConsentPage.clickAcceptRDGRadioBtn();
		AgreeCustConsentPage.clickSaveContBtn();
	}
	
	/*
	 * Test Case 8: 
	 *	Tasks:
	 *1) Accept MFIE
	 *2) Accept RDG
	 *3) Save and Continue
	 */
	
	@Test (priority=9)	
	public void test9() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		assertTrue(AgreeGenDisclsrPage.isPresentDayTradRiskDiscStat()); 
		AgreeGenDisclsrPage.clickAgreeCFTCbRadioBtn();
		AgreeGenDisclsrPage.clickAgreeCFTCAppndxARadioBtn();
		AgreeGenDisclsrPage.clickAgreeFBERiskDiscRadioBtn();
		AgreeGenDisclsrPage.clickAgreeIDARiskDiscRadioBtn();
		AgreeGenDisclsrPage.clickAgreeOCCRiskDiscRadioBtn();
		AgreeGenDisclsrPage.clickAgreeSSFRiskDiscRadioBtn();
		AgreeGenDisclsrPage.clickMexStckRiskDiscRadioBtn();
		AgreeGenDisclsrPage.clickNASDAQRadioBtn();
		AgreeGenDisclsrPage.fillESign1("Test Test");
		AgreeGenDisclsrPage.clickSaveContBtn();
	}
	
	/*
	 * Test Case 9: 
	 *	Tasks:
	 *1) Make Sure Agreement “Day Trading Risk Disclosure Statement” is present
	 *2) Accept all the agreements on the page (Not shown in the Image)
	 *3) Enter E-Signature
	 *4) Save and Continue
	 */
	
	@Test (priority=10)	
	public void test10() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		AgreeMarketDataPage.fillESign2("Test Test");
		AgreeMarketDataPage.clickSaveContBtn();
	}
	
	/*
	 * Test Case 10: 
	 *	Tasks:
	 *1) Enter E-Signature
	 *2) Save and Continue
	 */
	
	@Test (priority=11)	
	public void test11() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		AgreeOnlineNASDAQPage.fillESign3("Test Test");
		AgreeOnlineNASDAQPage.clickSaveContBtn();
	}
	
	/*
	 * Test Case 11: 
	 *	Tasks:
	 *1) Enter E-Signature
	 *2) Save and Continue
	 */
	
	@Test (priority=12)	
	public void test12() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		AgreeNASDBTDSPage.fillESign4("Test Test");
		AgreeNASDBTDSPage.fillESignSubscr("Test Test");
		AgreeNASDBTDSPage.clickSaveContBtn();
	}
	
	/*
	 * Test Case 12: 
	 *	Tasks:
	 *1) Enter E-Signature
	 *2) Enter Subscriber Sign
	 *3) Save and Continue
	 */

	@Test (priority=13)	
	public void test13() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		AgreeAccSetUpPage.clickSaveContBtn();
		driver.switchTo().alert().accept();
		
	}
	
	/*
	 * Test Case 13: 
	 *	Tasks:
	 *1) Save and Continue
	 *2) Accept alert message
	 */
	
	@Test (priority=14)	
	public void test14() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		AgreeSecureLoginSysPage.clickDoNotActBtn();
	}
	
	/*
	 * Test Case 14: 
	 *	Tasks:
	 *1) Click Do Not Act Button
	 */
	
	@Test (priority=15)	
	public void test15() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		assertTrue(CompletePendReviewPage.containsPendingReview());
	}
	
	/*
	 * Test Case 15: 
	 *	Tasks:
	 *1) Verify “Pending Review” String exist on the page
	 */
	
	
	@AfterTest
	public void afterMethod() throws Exception {
		driver.quit(); //quits the browser
	}
	/*
	 * Runs after Test
	 * All the resources allocated for a particular test are unallocated
	 */

}


