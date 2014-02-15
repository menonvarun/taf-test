package com.test.automation.framework.pagemodel.pagelocator;

import java.io.File;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.test.automation.framework.pagemodel.TestClass;

public class PageLocatorTest extends TestClass{

	@Test
	public void simplePageLocatorTest(){
		GoogleHomeLocatorPage homePage = to(GoogleHomeLocatorPage.class);
		
		homePage.searchForString("Testing");
		
		util.waitForPage(browser, GoogleResultsLocatorPage.class);		
		
		GoogleResultsLocatorPage resultsPage = at(GoogleResultsLocatorPage.class);
		
		resultsPage.clickOnResult();
		
		WebDriverWait wait = new WebDriverWait(browser.getDriver(), 60);
		wait.until(ExpectedConditions.titleContains("Software testing"));
	}
	
	
	@Test
	public void differentFilePageLocatorBasedTest(){
		File file = new File("src/test/resources/googlev1.properties");
		
		GoogleHomeLocatorPage homePage = to(GoogleHomeLocatorPage.class,file);
		
		homePage.searchForString("Testing");
		
		util.waitForElementPresent(browser.getDriver(), homePage.searchResult);
		
		homePage.searchResult.get(0).click();
		
		WebDriverWait wait = new WebDriverWait(browser.getDriver(), 60);
		wait.until(ExpectedConditions.titleContains("Software testing"));
	}
	
	@Test
	public void originalPageFactoryPageBasedTest(){
		GoogleHomeOriginalPageFactoryPage homePage = to(GoogleHomeOriginalPageFactoryPage.class);
		
		homePage.searchForString("Testing");
		
		util.waitForElementPresent(browser.getDriver(), homePage.searchResult);
		
		homePage.searchResult.get(0).click();
		
		WebDriverWait wait = new WebDriverWait(browser.getDriver(), 60);
		wait.until(ExpectedConditions.titleContains("Software testing"));
	}
}
