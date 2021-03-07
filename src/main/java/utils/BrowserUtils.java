package utils;

import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrowserUtils {
	
	static WebDriver driver;
	
	/****************** Select value From DropDown ***********************/
	public static void selectDropdown(WebElement element, String option){
		try {
        Select dropdownElement = new Select(element);
        dropdownElement.selectByVisibleText(option);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
    }
	
	/**************************Adding date stamp**************************/
	public static String getTimeStamp(){
		Date date = new Date();
		return date.toString().replaceAll(":", "_").replaceAll(" ", "_");
	}
	
	/**************************Wait for visibilty of the webelement**************************/
	public static void waitForVisibility(WebElement element) {
	WebDriverWait wait=new WebDriverWait(driver, 20);
	wait.until(ExpectedConditions.visibilityOf(element));
	}


}
