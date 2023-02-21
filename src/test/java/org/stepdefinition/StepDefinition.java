package org.stepdefinition;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.baseclass.nish.AdactinBaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.pom.nish.AdactinLoginPom;
import org.pom.nish.SearchHotelPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends AdactinBaseClass {
	AdactinLoginPom login;
	SearchHotelPage search;

	@When("I Give valid userName and Password")
	public void i_Give_valid_userName_and_Password() throws IOException {
		login = new AdactinLoginPom();
		login.adactLogin();
	}

	@When("I click on the login button")
	public void i_click_on_the_login_button() {
		login.clickLoginBtn();
	}

	@Then("I verify whether the search Hotel page is Displayed or Not with Reset Button")
	public void i_verify_whether_the_search_Hotel_page_is_Displayed_or_Not_with_Reset_Button() {
		search = new SearchHotelPage();
		search.verifyResetButton();

	}

	@When("I Give Valid details in the given fields")
	public void i_Give_Valid_details_in_the_given_fields() {
		// Write code here that turns the phrase above into concrete actions
		throw new cucumber.api.PendingException();
	}

	@When("I click on the Reset Button")
	public void i_click_on_the_Reset_Button() {
		// Write code here that turns the phrase above into concrete actions
		throw new cucumber.api.PendingException();
	}

	@Then("i Verify the all the fields should change into it's standard values")
	public void i_Verify_the_all_the_fields_should_change_into_it_s_standard_values() {
		// Write code here that turns the phrase above into concrete actions
		throw new cucumber.api.PendingException();
	}

	@Then("I verify whether the search Hotel page is Displayed or Not with Search Hotel text")
	public void i_verify_whether_the_search_Hotel_page_is_Displayed_or_Not_with_Search_Hotel_text() {
		WebElement searchTxt = driver.findElement(By.xpath("//a[text()='Search Hotel']"));
		String text = searchTxt.getText();
		System.out.println(text);
	}

	@When("I Give valid {string} and {string}")
	public void i_Give_valid_and(String userName, String passWord) throws IOException {
		// WebElement getuserName = login.getuserName();
		// getuserName.sendKeys(userName);
		// login.getpass().sendKeys(passWord);
		// login.getLoginBtn().click();
		System.out.println(userName);
		System.out.println(passWord);

	}

	@When("user enter valid username and password")
	public void user_enter_valid_username_and_password() {
		// Write code here that turns the phrase above into concrete actions
		throw new cucumber.api.PendingException();
	}

	@Then("click login button")
	public void click_login_button() {
		// Write code here that turns the phrase above into concrete actions
		throw new cucumber.api.PendingException();
	}

	@Then("the search hotel page is opened")
	public void the_search_hotel_page_is_opened() {
		// Write code here that turns the phrase above into concrete actions
		throw new cucumber.api.PendingException();
	}

	@When("I Give valid Name and Password")
	public void i_Give_valid_Name_and_Password(io.cucumber.datatable.DataTable dataTable) {
		// 1D without Header
		
		// List<String> asList = dataTable.asList();
		// String userName = asList.get(0);
		// System.out.println(userName);
		// List<String> asList2 = dataTable.asList();
		// String passWord = asList2.get(1);
		// System.out.println(passWord);
		// login.getuserName().sendKeys(userName);
		// login.getpass().sendKeys(passWord);
		// login.getLoginBtn().click();

		// 2d-WithOut Header
		
		// List<List<String>> asLists = dataTable.asLists();
		// System.out.println(asLists.get(1).get(2));
		// List<List<String>> asLists2 = dataTable.asLists();
		// System.out.println(asLists2.get(0).get(2));
		
		// 1D with header
		
//		Map<String, String> asMap = dataTable.asMap(String.class, String.class);
//		System.out.println(asMap.get("UserName"));
//		System.out.println(asMap.get("Password"));
		
		// 2D With header
		
		List<Map<String,String>> asMaps = dataTable.asMaps();
        System.out.println(asMaps.get(0).get("UserNameNew"));
        System.out.println(asMaps.get(0).get("Password"));
	}

}
