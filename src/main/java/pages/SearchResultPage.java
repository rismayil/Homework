package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;

import base.BasePage;

public class SearchResultPage extends BasePage {
	
	public SearchResultPage(WebDriver driver,ExtentTest logger) {
		super(driver,logger);
	}
	
	@FindBy(css=".header-primary__title-row .srp-header")
	public WebElement searchHeader;
	
	public void verifySearchHeader(String expectedHeader) {
		//Assert.assertEquals(searchHeader, expectedHeader);
	}

}
