package com.menonvarun.test.automation.framework.pagemodel.simplepage;

import java.io.File;

import com.menonvarun.test.automation.framework.locator.CustomPageFactory;
import com.menonvarun.test.automation.framework.pagemodel.PageClass;

public class SimpleGoogleResultsPage extends PageClass{
	SimpleGoogleLocator googleLocator;
	
	@Override
	public String toUrl() {
		return "";
	}

	@Override
	public boolean at() {		
		return googleLocator.searchResult.size() > 0;
	}
	
	@Override
	public void init() {
		File file = new File("src/test/resources/google.properties");
		googleLocator = CustomPageFactory.initElements(this.browser, SimpleGoogleLocator.class, file);
	}
	
	public void clickOnResult(){
        googleLocator.searchResult.get(0).click();
    }

}
