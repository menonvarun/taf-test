package org.imaginea.test.automation.framework.pagemodel.simplepagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;



public class GoogleResultsPage {
	GoogleLocator googleLocator;
	
	private WebDriver driver;
	
	public GoogleResultsPage(WebDriver driver){
		this.driver = driver;
		googleLocator = PageFactory.initElements(this.driver, GoogleLocator.class);
	}
	
	public void clickOnResult(){
        googleLocator.searchResult.get(0).click();
    }

}
