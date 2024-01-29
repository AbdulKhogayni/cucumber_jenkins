Feature: Navigation to facebook login page

  @facebook
  Scenario Outline: Facebook login page
    Given I am in the facebook home page
    When I enter username "<UserName>"
    And  I enter password "<Password>"
    And click on the sign in button
    Then I should see my profile
    Examples:
      | UserName                      |  | Password         |
      | abdulqadeerabdullah@yahoo.com |  | Afghanistan@2020 |
      | Khogyani20@gmail.com          |  | Afghanistan@2020 |