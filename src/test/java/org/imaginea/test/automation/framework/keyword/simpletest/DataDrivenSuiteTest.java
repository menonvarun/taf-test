package org.imaginea.test.automation.framework.keyword.simpletest;

import java.io.File;
import java.util.ArrayList;

import org.imaginea.test.automation.framework.config.DefaultConfig;
import org.imaginea.test.automation.framework.keywordmodel.executor.KeywordExecutor;
import org.imaginea.test.automation.framework.keywordmodel.suite.ISimpleTest;
import org.imaginea.test.automation.framework.keywordmodel.suite.TestSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class DataDrivenSuiteTest {
	@BeforeClass
	public void setListner(){
		DefaultConfig config = DefaultConfig.getDefaultConfig();
		config.setConfigValue("listeners", "org.imaginea.test.automation.framework.keyword.simpletest.BaseKeywordTesting");
	}
	
	@Test(dataProvider="Data")
	public void testExcutor(ISimpleTest simpleTest){
		File file = new File(simpleTest.getTestFilePath());
		KeywordExecutor keyExecutor = new KeywordExecutor(file);
		keyExecutor.execute();		
	}
	
	@DataProvider(name="Data")
	public Object[][] getTestData(){
		File file = new File("src/test/resources/keyword/simpletest/suite-csv.csv");
		TestSuite suiteReader = new TestSuite(file, new ArrayList<String>());
		return suiteReader.getTobeExecutedTests();
	}

}
