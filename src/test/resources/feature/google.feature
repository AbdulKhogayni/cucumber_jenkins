Feature: Navigation to google home page

  Background:
    Given I am in the google home page

  @google_01
  Scenario: google home page
    Then verify google home page title

  @google_02
  Scenario:
    Then I verified expected title is "Google"