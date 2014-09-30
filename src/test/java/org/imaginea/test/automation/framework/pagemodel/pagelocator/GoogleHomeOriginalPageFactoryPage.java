package org.imaginea.test.automation.framework.pagemodel.pagelocator;

import java.util.List;

import org.imaginea.test.automation.framework.pagemodel.PageClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class GoogleHomeOriginalPageFactoryPage extends PageClass{
	
	@FindBy(how=How.CSS,using="#gbqfq")
	public WebElement searchField;
	
	@FindBy(how = How.CSS,using=".gbqfb")
	public WebElement submitButton;
	
	@FindBy(how = How.CSS,using="h3.r > a")
	public List<WebElement> searchResult;
	
	@FindBy(how = How.CSS,using="h3.r > a")
	public WebElement searchResultText;
	
	@Override
	public String toUrl() {
		return "";
	}

	@Override
	public boolean at() {
		return getDriver().getTitle().contentEquals("Google");		
	}
	
	public void searchForString(String searchString){
		searchField.sendKeys(searchString);
        submitButton.click();
    }

	@Override
	public void init() {
		
	}

}
