package org.pom.nish;

import java.io.IOException;

import org.baseclass.nish.AdactinBaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactinLoginPom extends AdactinBaseClass {
	public AdactinLoginPom() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "username")
	private WebElement username;
	@FindBy(id = "password")
	private WebElement pass;
	@FindBy(id = "login")
	private WebElement LoginBtn;

	public WebElement getuserName() {
		return username;
	}

	public WebElement getpass() {
		return pass;
	}

	public WebElement getLoginBtn() {
		return LoginBtn;
	}
	public void adactLogin() throws IOException{
		String data = getData("Nishanth", 1, 0);
		username.sendKeys(data);
		String data2 = getData("Nishanth", 1, 1);
		pass.sendKeys(data2);
//		click(LoginBtn);
		
	}
	public void adactLogin(String userName, String passWord) {
	
		username.sendKeys(userName);
		
		pass.sendKeys(passWord);
//		click(LoginBtn);
		
	}
	
	public void clickLoginBtn() {
		click(LoginBtn);
	}
	
	 {
	
	}
	
}
