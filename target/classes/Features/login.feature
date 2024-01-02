Feature: Login

 I want to verify login with user credentials
 
 Scenario: Successfull Verification of Login functionality
  Given user should be on the login page
  And user enters email adress
  And user enters password
  And user clicks "login in" button
  Then user should navigate to "My Account"


 Scenario: Unsuccessful Verification of Login functionality

  Given user should be on the login page
  And user enters email adress
  And user enters password
  And user clicks "login in" button
  Then error message displayed with wrong credentials
  Given user should be on the login page
  And user returns back on the login page