Feature: Open demoblaze page

  As Moiso,
  I want to test the elements card and sub-functions,
  So that I can check the robustness and error control of the application or web page.

  Background:
    Given "Moiso" opens the test website

  @successful
  Scenario: Validation of the ID Card Elements function
    And he wants to validate the elements card function
    When he randomly selects one of the sub-functions
    Then he should see the name of the selected option in the header
