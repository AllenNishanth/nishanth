package org.testrunner.nish;

import org.baseclass.nish.ReportsExecution;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src\\test\\resources\\Feature\\Adactin.feature",
        glue="org.stepdefinition",
        dryRun=false,
        plugin= {"rerun:src\\test\\resources\\Reports\\Failed.txt",
        		"junit:src\\test\\resources\\Reports\\Adactin.xml",
        		"html:src\\test\\resources\\Reports",
        		"json:src\\test\\resources\\Reports\\Adactinjs.json"},
        tags= {"@Smoke,@Sanity"}
//       
//	features="src\\test\\resources\\Feature\\Login.feature",
//	glue="org.stepdefinition"
		)
public class TestrunnerNish {
@AfterClass
public static void afterExecution() {
ReportsExecution.reportsCreation(System.getProperty("user.dir") + "\\src\\test\\resources\\Reports\\Adactinjs.json");
}
}
