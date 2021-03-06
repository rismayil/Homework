package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;

import base.BasePage;
import utils.BrowserUtils;
public class LandingPage extends BasePage {
	
	
	public LandingPage(WebDriver driver,ExtentTest logger) {
		super(driver,logger);
	}
	
	@FindBy(name="stockType")
	public WebElement newAndUsedCarsDropdown;
	
	@FindBy(name="makeId")
	public WebElement allMakes;
	
	@FindBy(name="modelId")
	public WebElement allModels;
	
	@FindBy(name="priceMax")
	public WebElement price;
	
	@FindBy(name="radius")
	public WebElement distance;
	
	@FindBy(name="zip")
	public WebElement zipCode;
	
	@FindBy(xpath="//input[@value='Search']")
	public WebElement searchButton;
	
	@FindBy(css="._1f8Iv ._17xN4")
	public WebElement closeAd;
	
	
	
	public SearchResultPage searchUsedCars() {
//		invokeBrowser("Chrome");
//		OpenApplication();
		
		BrowserUtils.selectDropdown(newAndUsedCarsDropdown, "Used Cars");
		BrowserUtils.selectDropdown(allMakes, "Honda");
		BrowserUtils.selectDropdown(allModels, "Pilot");
		BrowserUtils.selectDropdown(price, "$50,000");
		if(closeAd.isDisplayed())
			closeAd.click();
		BrowserUtils.selectDropdown(distance, "100 Miles from");
		zipCode.sendKeys("60008");
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("document.querySelector(\"input[value='Search']\")");
		
		searchButton.click();
		
		return PageFactory.initElements(driver, SearchResultPage.class);
	}
	
	
	

}
