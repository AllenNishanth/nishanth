package org.stepdefinition;

import org.baseclass.nish.AdactinBaseClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends AdactinBaseClass{
	
	@Before
	public void beforeTheScenario() {
	launch(url, time);

	}
	@After
	public void afterTheScenario(Scenario s) {
	TakesScreenshot shot = (TakesScreenshot) driver;
	byte[] screenshot = shot.getScreenshotAs(OutputType.BYTES);
	s.embed(screenshot, "img/png");
	
	driver.quit();

	}

}
