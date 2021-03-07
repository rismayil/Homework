package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;

import base.BasePage;
import utils.BrowserUtils;

public class VehicleDetail extends BasePage {

	public VehicleDetail(WebDriver driver, ExtentTest logger) {
		super(driver, logger);
		
	}
	
	@FindBy(xpath="//h1[contains(text(),' 2019 Honda Pilot Touring 8-Passenger')]")
	public WebElement titleOftheCar;
	
	@FindBy(xpath="//*[@class='button-wrapper']//button[contains(text(),'Check Availability')]")
	public WebElement checkAvailabilityButton;
	
	@FindBy(css="[name=fname]")
	public WebElement firstNameTextBox;
	
	@FindBy(css="[name=lname]")
	public WebElement lastNameTextBox;
	
	@FindBy(css="[name=email]")
	public WebElement emailTextBox;
	
	@FindBy(css=".vdp-pricing__container")
	public WebElement paymentCalculator;
	
	public void verifyTitleOfTheCarAndCheckAvailabilityButton() {
		BrowserUtils.waitForVisibility(titleOftheCar);
		String expectedTitle  = " 2019 Honda Pilot Touring 8-Passenger";
		Assert.assertEquals(titleOftheCar, expectedTitle,"Title does not match");
		Assert.assertTrue(checkAvailabilityButton.isDisplayed());
	
	}
	
	public void enterContactInfoAndTakeScreenShot(WebElement element) {
		firstNameTextBox.sendKeys("Car");
		lastNameTextBox.sendKeys("Owner");
		emailTextBox.sendKeys("carowner@yahoo.com");
		BrowserUtils.scrollDownToElement(paymentCalculator);
		BrowserUtils.takeAScreenshot(driver);
	}
	
	

}
