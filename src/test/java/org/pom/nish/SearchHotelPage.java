package org.pom.nish;

import org.baseclass.nish.AdactinBaseClass;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotelPage extends AdactinBaseClass {
	public SearchHotelPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//td[contains(text(),'Search Hotel')]")
	private WebElement txtSearch;
	@FindBy(id = "location")
	private WebElement dDnLocation;
	@FindBy(id = "hotels")
	private WebElement dDnHotels;
	@FindBy(id = "room_type")
	private WebElement dDnRoomType;
	@FindBy(id = "room_nos")
	private WebElement dDnRoomNo;
	@FindBy(id = "datepick_in")
	private WebElement txtCheckIn;
	@FindBy(id = "datepick_out")
	private WebElement txtCheckOut;
	@FindBy(id = "adult_room")
	private WebElement dDnAduldRoom;
	@FindBy(id = "child_room")
	private WebElement dDnChildRoom;
	@FindBy(id = "Submit")
	private WebElement btnSearch;
	@FindBy(id = "Reset")
	private WebElement btnReset;

	public WebElement getdDnLocation() {
		return dDnLocation;
	}

	public WebElement getdDnHotels() {
		return dDnHotels;
	}

	public WebElement getdDnRoomType() {
		return dDnRoomType;
	}

	public WebElement getdDnRoomNo() {
		return dDnRoomNo;
	}

	public WebElement getTxtCheckIn() {
		return txtCheckIn;
	}

	public WebElement getTxtCheckOut() {
		return txtCheckOut;
	}

	public WebElement getdDnAduldRoom() {
		return dDnAduldRoom;
	}

	public WebElement getdDnChildRoom() {
		return dDnChildRoom;
	}

	public WebElement getBtnSearch() {
		return btnSearch;
	}

	public WebElement getTxtSearch() {
		return txtSearch;
	}

	public WebElement getBtnReset() {
		return btnReset;
	}

	public void verifyResetButton() {
		String attribute = btnReset.getAttribute("value");
		boolean equals = attribute.equals("Reset");
//		assertTrueVerification("verify Reset Button", equals);
		Assert.assertTrue("verify Reset Button", equals);
	}

	private void assertTrueVerification(String message, boolean equals) {
		// TODO Auto-generated method stub
		
	}

}
