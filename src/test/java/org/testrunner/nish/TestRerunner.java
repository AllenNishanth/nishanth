package org.testrunner.nish;

import org.junit.runner.RunWith;

import io.cucumber.datatable.CucumberDataTableException;

@RunWith(Cucumber)
@CucumberOptions(features="@src\\test\\resources\\Reports\\Failed.txt",glue="org.stepdefinition")

public class TestRerunner {

}
 