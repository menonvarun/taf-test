package com.menonvarun.test.automation.framework.util.locator;

import java.io.File;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DefaultFileGoogleLocator {
	
	@FindBy(how=How.CSS,using="search_box")
	public WebElement searchField;
	
	@FindBy(how = How.CSS,using="submit_button")
	public WebElement submitButton;
	
	@FindBy(how = How.CSS,using="search_result")
	public List<WebElement> searchResult;
	
	@FindBy(how = How.CSS,using="search_result_text")
	public WebElement searchResultText;

	public File getLocatorFile(){
		File file = new File("src/test/resources/google.properties");
		return file;
	}
}
