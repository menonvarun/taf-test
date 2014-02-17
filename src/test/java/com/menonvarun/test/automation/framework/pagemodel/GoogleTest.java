package com.menonvarun.test.automation.framework.pagemodel;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.menonvarun.test.automation.framework.pagemodel.simplepage.SimpleGoogleHomePage;
import com.menonvarun.test.automation.framework.pagemodel.simplepage.SimpleGoogleResultsPage;

public class GoogleTest extends TestClass{

	@Test
	public void googleTest(){
		SimpleGoogleHomePage homePage = to(SimpleGoogleHomePage.class);
		
		homePage.searchForString("Testing");
		
		util.waitForPage(browser, SimpleGoogleResultsPage.class);		
		
		SimpleGoogleResultsPage resultsPage = at(SimpleGoogleResultsPage.class);
		
		resultsPage.clickOnResult();
		
		WebDriverWait wait = new WebDriverWait(browser.getDriver(), 60);
		wait.until(ExpectedConditions.titleContains("Software testing"));
	}
	
}
