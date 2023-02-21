package org.baseclass.nish;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MorningBatch {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver =new ChromeDriver();
	driver.get("http://demo.automationtesting.in/Alerts.html");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
}
}
