Feature: verifying adactin application login

 Scenario: TC01 validating login
 When user enter valid username and password
 Then click login button
 And the search hotel page is opened
 
  Scenario: TC02_Validation of Adactin Hotel Search Hotel
    When User Enter Valid UserName and Password
    And User Clicks Login Button
    Then User Verify  Search Hotel Page is displayed
    When User Enter Valid Location,Hotels, RoomType, NumberOfRooms, CheckInDate, CheckOutDate, AdultPerRoom and ChildrenPerRoom
    And User Clicks Search Button