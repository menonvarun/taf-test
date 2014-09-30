package org.imaginea.test.automation.framework.driver;

import org.imaginea.test.automation.framework.config.DefaultConfig;
import org.imaginea.test.automation.framework.driver.CacheDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;


public class DriverCreationTest {
	
	@Test
	public void customDriverTest(){
		DefaultConfig config = DefaultConfig.getDefaultConfig();
		config.setConfigValue("userdefined.driverclass", "com.menonvarun.test.automation.framework.driver.UserDefinedDriverProvider");
		
		CacheDriverFactory driverFactory = new CacheDriverFactory();
		WebDriver driver = driverFactory.getDriver();
		driver.get("http://www.google.com");
	}
	
	@Test
	public void inbuildDriveCreationTest(){
		DefaultConfig config = DefaultConfig.getDefaultConfig();
		config.setConfigValue("driver.name", "firefox");
		
		CacheDriverFactory driverFactory = new CacheDriverFactory();
		WebDriver driver = driverFactory.getDriver();
		driver.get("http://www.google.com");		
	}

}
