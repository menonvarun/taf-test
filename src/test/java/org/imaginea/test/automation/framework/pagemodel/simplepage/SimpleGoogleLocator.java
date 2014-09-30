package org.imaginea.test.automation.framework.pagemodel.simplepage;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class SimpleGoogleLocator {
	
	@FindBy(how=How.CSS,using="search_box")
	public WebElement searchField;
	
	@FindBy(how = How.CSS,using="submit_button")
	public WebElement submitButton;
	
	@FindBy(how = How.CSS,using="search_result")
	public List<WebElement> searchResult;
	
	@FindBy(how = How.CSS,using="search_result_text")
	public WebElement searchResultText;

}
