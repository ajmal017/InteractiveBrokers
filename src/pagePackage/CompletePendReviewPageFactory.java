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
	 * CompletePendReviewPage
	 */

public class CompletePendReviewPageFactory {
	
	WebDriver driver;
	
	@FindBy (xpath = "//div[@class='app_status_box_title']/span[@class='required']")
	WebElement pendReview;

	public CompletePendReviewPageFactory(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);  //initiates all the elements
	}
	
	public boolean containsPendingReview(){
		String pendRev = pendReview.getText();
		System.out.println(pendRev);
		boolean result = pendRev.contains("Pending Review");
		return result;
	}
	//verifies Pending Review 
}
	

	
