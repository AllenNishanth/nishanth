package org.baseclass.nish;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenShot {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	// To get Screen Shot
			// Upcasting
			TakesScreenshot s =(TakesScreenshot)driver;
			Object screenshotAs = s.getScreenshotAs(OutputType.FILE);
}
}
