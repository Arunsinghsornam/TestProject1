
@tag
Feature: validate the face book login page

Background: 
Given user is on facebook application
Then user verify the login page displayed


  
  Scenario: TC_01 validation of login page withvalid credential
    When user enter the valid username and password
    And click the login button
    Then user verify the home page is displayed

  
  Scenario Outline: TC_02 validation of logiin page with multiple invalid credential 
    When user enter invalid "<username>" and "<password>"
    And user click the login button
    Then user verify the error is displayed

    Examples: 
      | username | password | 
      |  karthickarun99@gmail.com |    Arunsingh@1988  | 
      | karthickkarthick88@gmail.com |     karthickarun@1988 | 
