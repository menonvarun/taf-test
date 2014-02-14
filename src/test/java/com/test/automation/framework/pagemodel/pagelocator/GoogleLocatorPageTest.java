package com.test.automation.framework.pagemodel.pagelocator;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.test.automation.framework.pagemodel.TestClass;

public class GoogleLocatorPageTest extends TestClass{

	@Test
	public void googleTest(){
		GoogleHomeLocatorPage homePage = to(GoogleHomeLocatorPage.class);
		
		homePage.searchForString("Testing");
		
		util.waitForPage(browser, GoogleResultsLocatorPage.class);		
		
		GoogleResultsLocatorPage resultsPage = at(GoogleResultsLocatorPage.class);
		
		resultsPage.clickOnResult();
		
		WebDriverWait wait = new WebDriverWait(browser.getDriver(), 60);
		wait.until(ExpectedConditions.titleContains("Software testing"));
	}
	
}
