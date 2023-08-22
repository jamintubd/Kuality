package KUALITY_TESTRUNNER;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import KUALITY_UTILITY.Kuality_Base;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = {"src/test/resources/KUALITY_FEATURES"},
plugin = {"json:target/cucumber.json"},//HTML report/test result
glue = "KUALITY_STEPDEFF")//tags = {"@Next"}}


public class Kuality_TestRunner extends AbstractTestNGCucumberTests {
	
	
	@BeforeTest
	public void KualityStartURL () {
		Kuality_Base startURL = new Kuality_Base();
		startURL.Kuality_Browser();
		
		
	}
@AfterTest
public void KualityCloseURL() {
	Kuality_Base startURL = new Kuality_Base();
	startURL.driver.quit();
}
}
