package org.imaginea.test.automation.framework.keyword.simpletest;

import java.io.File;

import org.imaginea.test.automation.framework.config.DefaultConfig;
import org.imaginea.test.automation.framework.keywordmodel.executor.KeywordExecutor;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class KeyworFileTest {
	@BeforeClass
	public void setListner(){
		DefaultConfig config = DefaultConfig.getDefaultConfig();
		config.setConfigValue("listeners", "org.imaginea.test.automation.framework.keyword.simpletest.BaseKeywordTesting");
	}
	
	@Test
	public void testMethod(){
		File file = new File("src/test/resources/keyword/simpletest/test-keyword.csv");
		KeywordExecutor keyExecutor = new KeywordExecutor(file);
		keyExecutor.execute();
	}

}
