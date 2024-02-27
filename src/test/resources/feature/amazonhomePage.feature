Feature: amazon home page

  @amazonLoginTest
  Scenario: navigation to amazon login page
    Given I am in amazon home page
    Then  I verify amazon logo is displayed
    And   I verify default selected department is "All Departments"