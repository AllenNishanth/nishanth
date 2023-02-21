package org.pom.nish;

import org.baseclass.nish.AdactinBaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomeToAdactin extends AdactinBaseClass{
public WelcomeToAdactin() {
	PageFactory.initElements(driver,this);
}
@FindBy(id="location")
 private WebElement clcLocation;
@FindBy(id="hotel")
private WebElement clchotel;
@FindBy (id="room_type")
private WebElement clcroomtype;
@FindBy (id="room_nos")
private WebElement clcroomnum;
@FindBy (id="datepick_in")
private WebElement checkin;
@FindBy (id="datepick_out")
private WebElement checkout;
@FindBy (id="adult_room")
private WebElement room;
@FindBy (id="child_room")
private WebElement chroom;



public WebElement getClcLocation() {
	return clcLocation;
}



public WebElement getClchotel() {
	return clchotel;
}



public WebElement getClcroomtype() {
	return clcroomtype;
}



public WebElement getClcroomnum() {
	return clcroomnum;
}



public WebElement getCheckin() {
	return checkin;
}



public WebElement getCheckout() {
	return checkout;
}



public WebElement getRoom() {
	return room;
}



public WebElement getChroom() {
	return chroom;
}


public void searchHotel(String location, String hotels, String roomType, String roomNo, String checkIn,
		String checkOut, String adultRoom, String childRoom) {

	selectOptionsByVisibleText(getClcLocation(), location);
	selectOptionsByVisibleText(getClchotel(), hotels);
	selectOptionsByVisibleText(getClcroomtype(), roomType);
	selectOptionsByVisibleText(getClcroomnum(), roomNo);
	clearTextbox(getCheckin());
	insertValue(getCheckin(), checkIn);
	clearTextbox(getCheckout());
	insertValue(getCheckout(), checkOut);
	selectOptionsByVisibleText(getRoom(), adultRoom);
	selectOptionsByVisibleText(getChroom(), childRoom);
	
}


}








