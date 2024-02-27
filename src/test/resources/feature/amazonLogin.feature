Feature: Login to amazon account

  @AmazonLoginTest
  Scenario: Login with valid credentials.
    Given I am in amazon home page
    When  I hover over mouse on hello, sign in
    And   I click on sign in button
    Then  I verify amazon logo is displayed in the top of hte page
    When  I enter valid user name
    Then  I click on continue btn
    And   I enter valid password
    Then  I click on second sign in button