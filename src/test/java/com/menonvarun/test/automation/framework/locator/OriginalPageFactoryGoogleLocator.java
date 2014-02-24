package com.menonvarun.test.automation.framework.locator;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class OriginalPageFactoryGoogleLocator {
	
	@FindBy(how=How.CSS,using="#gbqfq")
	public WebElement searchField;
	
	@FindBy(how = How.CSS,using=".gbqfb")
	public WebElement submitButton;
	
	@FindBy(how = How.CSS,using="h3.r > a")
	public List<WebElement> searchResult;
	
	@FindBy(how = How.CSS,using="h3.r > a")
	public WebElement searchResultText;

}
