package org.imaginea.test.automation.framework.pagemodel.simplepagefactory;

import org.imaginea.test.automation.framework.pagemodel.TestClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class PageGoogleTest extends TestClass{
	
	WebDriver driver;
	
	@BeforeMethod
	public void before(){
		driver = new FirefoxDriver();
	}
	
	@AfterMethod
	public void after(){
		driver.quit();
	}

	@Test
	public void googleTest(){
		driver.get("http://www.google.com");
		GoogleHomePage homePage =  new GoogleHomePage(driver);
		
		homePage.searchForString("Testing");
		
		waitForElementPresent(driver, homePage.googleLocator.searchResult);
		
		GoogleResultsPage resultsPage = new GoogleResultsPage(driver);
		
		resultsPage.clickOnResult();
		
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.titleContains("Software testing"));
	}
	
}
