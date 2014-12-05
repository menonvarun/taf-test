package org.imaginea.test.automation.framework.pagemodel.pagelocator;

import java.io.File;
import java.util.List;

import org.imaginea.test.automation.framework.dom.filter.Filter;
import org.imaginea.test.automation.framework.pagemodel.PageClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class GoogleHomeLocatorPage extends PageClass{
	
	@FindBy(how=How.CSS,using="search_box")
	public WebElement searchField;
	
	@FindBy(how = How.CSS,using="submit_button")
	public WebElement submitButton;
	
	@FindBy(how = How.CSS,using="search_result")
	public List<WebElement> searchResult;
	
	@FindBy(how = How.CSS,using="search_result_text")
	public WebElement searchResultText;

	@Override
	public String toUrl() {
		return "";
	}

	@Override
	public boolean at() {
		return getDriver().getTitle().contentEquals("Google");		
	}
	
	@Override
	public File getLocatorFile(){
		/*File file = new File("src/test/resources/google.properties");
		return file;*/
		return evaluateLocatorFile("/google.properties");

	}
	
	public void searchForString(String searchString){
		searchField.sendKeys(searchString);
        submitButton.click();
    }

	@Override
	public void init() {
		
	}

}
