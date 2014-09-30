package org.imaginea.test.automation.framework.datadrive;

import org.imaginea.test.automation.framework.datadrive.ExcelDataDrive;
import org.imaginea.test.automation.framework.datadrive.ClassParser.ClassParserException;
import org.imaginea.test.automation.framework.datadrive.ClassParser.DataNotAvailableException;
import org.imaginea.test.automation.framework.pagemodel.TestClass;
import org.imaginea.test.automation.framework.pagemodel.simplepage.SimpleGoogleHomePage;
import org.imaginea.test.automation.framework.pagemodel.simplepage.SimpleGoogleResultsPage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class GoogleSearchDataTest extends TestClass{
	
	@Test(dataProvider="googleSearchData")
	public void googleTest(GoogleSearchData data){
		SimpleGoogleHomePage homePage = to(SimpleGoogleHomePage.class);
		
		homePage.searchForString(data.searchtext);
		
		util.waitForPage(browser, SimpleGoogleResultsPage.class);		
		
		SimpleGoogleResultsPage resultsPage = at(SimpleGoogleResultsPage.class);
		
		resultsPage.clickOnResult();
		
		WebDriverWait wait = new WebDriverWait(browser.getDriver(), 60);
		wait.until(ExpectedConditions.titleContains(data.titleToWait));
	}
	
	@DataProvider(name="googleSearchData")
	public Object[][] googleSearchData() throws ClassParserException, DataNotAvailableException{
		ExcelDataDrive excelData = 
				new ExcelDataDrive("src/test/resources/datadrive/GoogleSearchData.xls");
		return excelData.getTestngData(GoogleSearchData.class);
	}
}
