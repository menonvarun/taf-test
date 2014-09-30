package org.imaginea.test.automation.framework.driver;

import org.imaginea.test.automation.framework.config.DefaultConfig;
import org.imaginea.test.automation.framework.driver.IDriverProvider;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


class UserDefinedDriverProvider implements IDriverProvider{
	
	DefaultConfig config = DefaultConfig.getDefaultConfig();

	@Override
	public WebDriver getDriver() {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		return driver;
	}

}
