Feature: Verifying the Functional parts of Adactin Application

  @Regression @Sanity @Smoke
  Scenario: Verification of Reset Button in Search Hotel Page
    When I Give valid userName and Password
    And I click on the login button
    Then I verify whether the search Hotel page is Displayed or Not with Reset Button
    When I Give Valid details in the given fields
    When I click on the Reset Button
    Then i Verify the all the fields should change into it's standard values

  @Sanity @Smoke
  Scenario: TC02:Verification of Reset Button in Search Hotel Page
    When I Give valid userName and Password
    And I click on the login button
    Then I verify whether the search Hotel page is Displayed or Not with Search Hotel text
    When I Give Valid details in the given fields
    When I click on the Reset Button
    Then i Verify the all the fields should change into it's standard values

  #@Sanity @Smoke
  #Scenario Outline: TC03:Verification of Reset Button in Search Hotel Page
  #When I Give valid "<userName>" and "<Password>"
  #And I click on the login button
  #Then I verify whether the search Hotel page is Displayed or Not with Reset Button
  #When I Give Valid details in the given fields
  #When I click on the Reset Button
  #Then i Verify the all the fields should change into it's standard values
  #
  #Examples:
  #| userName | Password |
  #| Andrew07 | LWW632   |
  #| Andrew07 | LWW632   |
  #| Andrew07 | LWW632   |
  @Sanity @Smoke
  Scenario: TC03:Verification of Reset Button in Search Hotel Page
    When I Give valid Name and Password
      | UserName | Password | UserNameNew | PasswordNew |
      | Andrew07 | LWW632   | Andrew08    | LWW6345   |
    And I click on the login button
    Then I verify whether the search Hotel page is Displayed or Not with Search Hotel text
    When I Give Valid details in the given fields
    When I click on the Reset Button
    Then i Verify the all the fields should change into it's standard values
