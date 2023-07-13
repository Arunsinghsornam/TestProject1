
@tag
Feature: verify the facebook application
Scenario: verify the login page with data table
Given user is on facebook login page
When user enthe the username and password
|karthickarun87@gmail.com|
|Arunsingh@1988|
And user click the login button
Then user verify the home page