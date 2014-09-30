package org.imaginea.test.automation.framework.datadrive;

import org.imaginea.test.automation.framework.driver.CacheDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;


public class DriverTest {
	
	@Test
	public void getDriverTest(){
		CacheDriverFactory driverFactory = new CacheDriverFactory();
		WebDriver driver = driverFactory.getDriver();
		driver.get("http://www.google.com");
	}

}
