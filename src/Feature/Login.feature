
@TestLogin
Feature: Login to the Application

@SmokeTest
Scenario: Successful Login to the Application with Valid Credentials
Given User is on the Application login page
When user enters valid user name
And user enters valid password
And user clicks on the login button
Then user is on the Application home page

@SmokeTest
Scenario: Logout of the Application
When user logs out of the Application
Then Message is displayed         

  
