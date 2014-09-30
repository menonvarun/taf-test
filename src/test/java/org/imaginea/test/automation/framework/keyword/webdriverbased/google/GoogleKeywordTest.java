package org.imaginea.test.automation.framework.keyword.webdriverbased.google;

import java.io.File;


import org.imaginea.test.automation.framework.config.DefaultConfig;
import org.imaginea.test.automation.framework.keywordmodel.executor.KeywordExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class GoogleKeywordTest {
	WebDriver driver;
	@BeforeClass
	public void setListner(){
		DefaultConfig config = DefaultConfig.getDefaultConfig();
		config.setConfigValue("listeners", "org.imaginea.test.automation.framework.keyword.webdriverbased.google.GoogleKeyword");
	}
	
	@BeforeMethod
	public void before(){
		driver = new FirefoxDriver();
	}
	
	@Test
	public void googleSearchKeywordTest(){
		
		File file = new File("src/test/resources/GoogleKeywordTest.xls");
		KeywordExecutor keyExecutor = new KeywordExecutor(driver, file,(String[]) null);
		keyExecutor.execute();
		
	}
	
	@AfterMethod
	public void after(){
		driver.quit();
	}

}
