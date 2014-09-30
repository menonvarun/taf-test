package org.imaginea.test.automation.framework.keyword.simpletest;

import org.imaginea.test.automation.framework.keywordmodel.keywords.KeywordBase;
import org.openqa.selenium.WebDriver;


public class BaseKeywordTesting extends KeywordBase{
	
	public BaseKeywordTesting(WebDriver driver){
		
	}
	public void testing(String t){
		System.out.println(t);
	}
	
	public void testing(String t, int i){
		System.out.println(t+i);
	}
	
	public void testing(int i){
		System.out.println("int"+i);
	}
	
	public void testing(long i){
		System.out.println("long"+i);
	}
	
	public void testing(double i){
		System.out.println("double"+i);
	}
	
	public void testing(float i){
		System.out.println("float"+i);
	}

}
