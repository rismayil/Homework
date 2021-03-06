package base;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;

import pages.LandingPage;
import utils.BrowserUtils;

public class BasePage extends BaseTest {
	
	public ExtentTest logger;
	
	
	public BasePage(WebDriver driver,ExtentTest logger) {
		this.driver=driver;
		this.logger=logger;
	}
	
	
	
	
	/****************** OpenApplication ***********************/
	public LandingPage OpenApplication() {
		driver.get("https://www.cars.com/");
		LandingPage landingPage = new LandingPage(driver, logger);
	    PageFactory.initElements(driver, landingPage);
		return landingPage;
	}
	
	public void getTitle(String expectedTitle) {
		Assert.assertEquals(driver.getTitle(), expectedTitle);
	}
	
	/****************** Capture Screen Shot ***********************/
	public void takeScreenShotOnFailure() {
		TakesScreenshot takeScreenShot = (TakesScreenshot) driver;
		File sourceFile = takeScreenShot.getScreenshotAs(OutputType.FILE);

		File destFile = new File(System.getProperty("user.dir") + "/ScreenShots/" +  BrowserUtils.getTimeStamp() + ".png");
		try {
			FileUtils.copyFile(sourceFile, destFile);
			logger.addScreenCaptureFromPath(System.getProperty("user.dir" +"/Screenshots/") + BrowserUtils.getTimeStamp() + ".png");
		

		} catch (IOException e) {
			e.printStackTrace();
		}

	
	
	}

}
