@tag
Feature: verify the facebook application
Scenario: verify the login page with data table
Given user is on facebook login page
When user enthe the username and password
|username|karthickarun87@gmail.com|
|password|Arunsingh@1987|
|username1|karthickarun88@gmail.com|
|password1|Arunsingh@1988|
|username2|karthickarun89@gmail.com|
|password2|Arunsingh@1989|
And user click the login button
Then user verify the home page
