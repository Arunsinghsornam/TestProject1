
Feature: validate the facebook login page

Scenario: validate the facebook login page with valid credential

Given user is on facebook webpage

Then user enter the valid username and password

And user click the login button

Then user verify the home page

Scenario: validate the facebook login page with invalid credential

Given user is on facebook webpage

Then user enter the invalid username and password

And user click the login button

Then user verify the invalid login error