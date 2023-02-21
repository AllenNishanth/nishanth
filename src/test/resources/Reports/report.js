$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Feature/Adactin.feature");
formatter.feature({
  "name": "Verifying the Functional parts of Adactin Application",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Verification of Reset Button in Search Hotel Page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Regression"
    },
    {
      "name": "@Sanity"
    },
    {
      "name": "@Smoke"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I Give valid userName and Password",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.i_Give_valid_userName_and_Password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on the login button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.i_click_on_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify whether the search Hotel page is Displayed or Not with Reset Button",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.i_verify_whether_the_search_Hotel_page_is_Displayed_or_Not_with_Reset_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Give Valid details in the given fields",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.i_Give_Valid_details_in_the_given_fields()"
});
formatter.result({
  "error_message": "cucumber.api.PendingException: TODO: implement me\r\n\tat org.stepdefinition.StepDefinition.i_Give_Valid_details_in_the_given_fields(StepDefinition.java:41)\r\n\tat ✽.I Give Valid details in the given fields(file:src/test/resources/Feature/Adactin.feature:8)\r\n",
  "status": "pending"
});
formatter.step({
  "name": "I click on the Reset Button",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.i_click_on_the_Reset_Button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "i Verify the all the fields should change into it\u0027s standard values",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.i_Verify_the_all_the_fields_should_change_into_it_s_standard_values()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "TC02:Verification of Reset Button in Search Hotel Page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Sanity"
    },
    {
      "name": "@Smoke"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I Give valid userName and Password",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.i_Give_valid_userName_and_Password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on the login button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.i_click_on_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify whether the search Hotel page is Displayed or Not with Search Hotel text",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.i_verify_whether_the_search_Hotel_page_is_Displayed_or_Not_with_Search_Hotel_text()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Give Valid details in the given fields",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.i_Give_Valid_details_in_the_given_fields()"
});
formatter.result({
  "error_message": "cucumber.api.PendingException: TODO: implement me\r\n\tat org.stepdefinition.StepDefinition.i_Give_Valid_details_in_the_given_fields(StepDefinition.java:41)\r\n\tat ✽.I Give Valid details in the given fields(file:src/test/resources/Feature/Adactin.feature:17)\r\n",
  "status": "pending"
});
formatter.step({
  "name": "I click on the Reset Button",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.i_click_on_the_Reset_Button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "i Verify the all the fields should change into it\u0027s standard values",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.i_Verify_the_all_the_fields_should_change_into_it_s_standard_values()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "TC03:Verification of Reset Button in Search Hotel Page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Sanity"
    },
    {
      "name": "@Smoke"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I Give valid Name and Password",
  "rows": [
    {
      "cells": [
        "UserName",
        "Password",
        "UserNameNew",
        "PasswordNew"
      ]
    },
    {
      "cells": [
        "Andrew07",
        "LWW632",
        "Andrew08",
        "LWW6345"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.i_Give_valid_Name_and_Password(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on the login button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.i_click_on_the_login_button()"
});
formatter.result({
  "error_message": "java.lang.NullPointerException\r\n\tat org.stepdefinition.StepDefinition.i_click_on_the_login_button(StepDefinition.java:28)\r\n\tat ✽.I click on the login button(file:src/test/resources/Feature/Adactin.feature:40)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "I verify whether the search Hotel page is Displayed or Not with Search Hotel text",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.i_verify_whether_the_search_Hotel_page_is_Displayed_or_Not_with_Search_Hotel_text()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I Give Valid details in the given fields",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.i_Give_Valid_details_in_the_given_fields()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I click on the Reset Button",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.i_click_on_the_Reset_Button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "i Verify the all the fields should change into it\u0027s standard values",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.i_Verify_the_all_the_fields_should_change_into_it_s_standard_values()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
});