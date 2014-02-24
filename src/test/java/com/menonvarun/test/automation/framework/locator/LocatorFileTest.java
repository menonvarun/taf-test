package com.menonvarun.test.automation.framework.locator;


import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.menonvarun.test.automation.framework.locator.CustomPageFactory;
import com.menonvarun.test.automation.framework.util.Utilities;


public class LocatorFileTest {

	WebDriver driver;
	@BeforeMethod
	public void beforeMethod(){
		driver = new FirefoxDriver();
	}
	
	@Test
	public void externalFileBasedLocatorTest() {
		File file = new File("src/test/resources/google.properties");
		ExternalFileGoogleLocator googleSearch = CustomPageFactory.initElements(driver, ExternalFileGoogleLocator.class, file);
		
		Utilities util = new Utilities();
		
		driver.get("http://www.google.co.in");
		googleSearch.searchField.sendKeys("Testing");
		googleSearch.submitButton.click();
		util.waitForElementPresent(driver,googleSearch.searchResult);
		String text = googleSearch.searchResult.get(0).getText();
		Assert.assertTrue(text.contains("Software testing"));		
	}
	
	@Test
	public void defaultFileBasedLocatorTest() {
		
		DefaultFileGoogleLocator googleSearch = CustomPageFactory.initElements(driver, DefaultFileGoogleLocator.class);
		
		Utilities util = new Utilities();
		
		driver.get("http://www.google.co.in");
		googleSearch.searchField.sendKeys("Testing");
		googleSearch.submitButton.click();
		util.waitForElementPresent(driver,googleSearch.searchResult);
		String text = googleSearch.searchResult.get(0).getText();
		Assert.assertTrue(text.contains("Software testing"));		
	}
	
	@Test
	public void customExternalFileBasedLocatorTest() {
		File file = new File("src/test/resources/google.properties");
		DefaultFileGoogleLocator googleSearch = CustomPageFactory.initElements(driver, DefaultFileGoogleLocator.class,file);
		
		Utilities util = new Utilities();
		
		driver.get("http://www.google.co.in");
		googleSearch.searchField.sendKeys("Testing");
		googleSearch.submitButton.click();
		util.waitForElementPresent(driver,googleSearch.searchResult);
		String text = googleSearch.searchResult.get(0).getText();
		Assert.assertTrue(text.contains("Software testing"));		
	}
	
	@Test
	public void defaultPageFactoryBasedLocatorTest() {
		
		OriginalPageFactoryGoogleLocator googleSearch = CustomPageFactory.initElements(driver, OriginalPageFactoryGoogleLocator.class);
		
		Utilities util = new Utilities();
		
		driver.get("http://www.google.co.in");
		googleSearch.searchField.sendKeys("Testing");
		googleSearch.submitButton.click();
		util.waitForElementPresent(driver,googleSearch.searchResult);
		String text = googleSearch.searchResult.get(0).getText();
		Assert.assertTrue(text.contains("Software testing"));		
	}
	
	@AfterMethod
	public void afterMethod(){
		driver.quit();
	}
	

}
