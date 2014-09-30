package org.imaginea.test.automation.framework.pagemodel.simplepagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;




public class GoogleHomePage{
	
	public GoogleLocator googleLocator;
	
	private WebDriver driver;
	
	public GoogleHomePage(WebDriver driver){
		this.driver = driver;
		googleLocator = PageFactory.initElements(this.driver, GoogleLocator.class);
	}
	
	
	public void searchForString(String searchString){
		googleLocator.searchField.sendKeys(searchString);
        googleLocator.submitButton.click();
    }

	

}
