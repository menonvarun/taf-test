package com.test.automation.framework.pagemodel.simplepage;

import java.io.File;

import com.test.automation.framework.locator.CustomPageFactory;
import com.test.automation.framework.pagemodel.PageClass;

public class SimpleGoogleHomePage extends PageClass{
	
	public SimpleGoogleLocator googleLocator;

	@Override
	public String toUrl() {
		return "";
	}

	@Override
	public boolean at() {
		return getDriver().getTitle().contentEquals("Google");		
	}
	
	public void searchForString(String searchString){
		googleLocator.searchField.sendKeys(searchString);
        googleLocator.submitButton.click();
    }

	@Override
	public void init() {
		File file = new File("src/test/resources/google.properties");
		googleLocator = CustomPageFactory.initElements(this.browser, SimpleGoogleLocator.class, file);
	}

}
