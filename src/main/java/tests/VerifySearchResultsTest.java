package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import base.BasePage;
import base.BaseTest;
import pages.LandingPage;
import pages.SearchResultPage;

public class VerifySearchResultsTest extends BaseTest {
	
	WebDriver driver;
	
	LandingPage landingPage;
	SearchResultPage searchResultsPage;
	
	
	@Test(priority=1)
	public void verifyFiltersDisplayed() {
		
		BasePage basePage = new BasePage(driver,logger);
		basePage.invokeBrowser("chrome");
		landingPage = basePage.OpenApplication();
		searchResultsPage=landingPage.searchUsedCars();
		searchResultsPage.verifyFiltersDisplayed();
		
	}
	
	@Test(priority=2)
	public void verifyNewFilterDisplayedUsedFilterNotDisplayed() {
		searchResultsPage.verifyNewFilterDisplayedUsedFilterNotDisplayed();
		
	}
	
	@Test(priority=3)
	public void touring8PassengerTrimFilterIsDisplayed() {
		searchResultsPage.touring8PassengerTrimFilterIsDisplayed();
	}


}
