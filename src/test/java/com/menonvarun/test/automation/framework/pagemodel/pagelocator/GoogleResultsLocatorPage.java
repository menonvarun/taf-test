package com.menonvarun.test.automation.framework.pagemodel.pagelocator;

import java.io.File;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.menonvarun.test.automation.framework.pagemodel.PageClass;

public class GoogleResultsLocatorPage extends PageClass{
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
		return searchResult.size() > 0;
	}
	
	@Override
	public File getLocatorFile(){
		File file = new File("src/test/resources/google.properties");
		return file;
	}
	
	@Override
	public void init() {
		
	}
	
	public void clickOnResult(){
        searchResult.get(0).click();
    }

}
