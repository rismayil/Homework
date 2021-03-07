package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;

import base.BasePage;
import utils.BrowserUtils;

public class SearchResultPage extends BasePage {
	
	public SearchResultPage(WebDriver driver,ExtentTest logger) {
		super(driver,logger);
	}
	
	@FindBy(css=".header-primary__title-row .srp-header")
	public WebElement searchHeader;
	
	
	@FindBy(xpath="//header[@class='filter-header']//label[contains(text(),'Maximum Price: $50,000')]")
	public WebElement maxPriceFilter;
	
	@FindBy(xpath="//header[@class='filter-header']//label[contains(text(),'Honda')]")
	public WebElement makeFilter;
	
	@FindBy(xpath="//header[@class='filter-header']//label[contains(text(),'Pilot')]")
	public WebElement modelFilter;
	
	@FindBy(xpath="//header[@class='filter-header']//label[contains(text(),'Used')]")
	public WebElement usedFilter;
	
	@FindBy(xpath="//label[normalize-space()='New']")
	public WebElement newRadioButton;
	
	@FindBy(xpath="//label[normalize-space()='Used']")
	public WebElement usedRadioButton;
	
	@FindBy(xpath="//header[@class='filter-header']//label[contains(text(),'New')]")
	public WebElement newFilter;
	
	@FindBy(xpath="//label[normalize-space()='Touring 8-Passenger']")
	public WebElement touring8PassengerTrim;
	
	@FindBy(xpath="//header[@class='filter-header']//label[contains(text(),'Touring 8-Passenger')]")
	public WebElement touring8PassengerTrimFilter;
	
	@FindBy(css="#srp-listing-rows-container .shop-srp-listings__listing-container")
	public List<WebElement> listings;
	
	public void verifyFiltersDisplayed() {
		//Assert.assertEquals(searchHeader, expectedHeader);
		Assert.assertTrue(maxPriceFilter.isDisplayed());
		Assert.assertTrue(makeFilter.isDisplayed());
		Assert.assertTrue(modelFilter.isDisplayed());
		Assert.assertTrue(usedFilter.isDisplayed());
	}
	
	public void verifyNewFilterDisplayedUsedFilterNotDisplayed() {
		BrowserUtils.waitForVisibility(newRadioButton);
		newRadioButton.click();
		Assert.assertTrue(newFilter.isDisplayed());
		Assert.assertFalse(usedFilter.isDisplayed());
	}
	
	public void touring8PassengerTrimFilterIsDisplayed() {
		
		touring8PassengerTrim.click();
		Assert.assertTrue(touring8PassengerTrimFilter.isDisplayed());
	}



}
