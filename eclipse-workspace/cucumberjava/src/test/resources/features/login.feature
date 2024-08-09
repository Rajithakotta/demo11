#Author
#Date
#descripition
Feature: feature to test login functionality

  Scenario: check login is successfull with valid creditionals
    Given browser is open
    And user is on login page
    When user enters username and password
    And user clicks on login
    Then user is navigated to the home page
 