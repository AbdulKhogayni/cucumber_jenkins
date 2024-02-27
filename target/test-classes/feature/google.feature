Feature: Navigation to google home page

  Background:
    Given I am in the google home page

  @google_01
  Scenario: google home page
    Then verify google home page title

  @google_02
  Scenario:
    Then I verified expected title is "Google"
    And I send text "Code in Java"
    Then I should see the result
    Then from the result list click on "code in java online" if available


