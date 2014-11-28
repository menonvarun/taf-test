package org.imaginea.test.automation.framework.pagemodel.simplepage;

import org.imaginea.test.automation.framework.pagemodel.TestClass;
import org.imaginea.test.automation.framework.pagemodel.simplepage.SimpleGoogleHomePage;
import org.imaginea.test.automation.framework.pagemodel.simplepage.SimpleGoogleResultsPage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;



public class SimplePageGoogleTest extends TestClass{

	@Test
	public void googleTest(){
		SimpleGoogleHomePage homePage = to(SimpleGoogleHomePage.class);
		
		homePage.searchForString("Testing");
		
		waitForPage(browser, SimpleGoogleResultsPage.class);
		
		SimpleGoogleResultsPage resultsPage = at(SimpleGoogleResultsPage.class);
		
		resultsPage.clickOnResult();
		
		WebDriverWait wait = new WebDriverWait(browser.getDriver(), 60);
		wait.until(ExpectedConditions.titleContains("Software testing"));
	}
	
}
