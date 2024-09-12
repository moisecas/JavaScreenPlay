Feature: Open demoblaze page

  As Moiso,
  I want to test the elements card and sub-functions,
  So that I can check the robustness and error control of the application or web page.

  Background:
    Given "Moiso" opens the test website

  @successful
  Scenario: Open web validation target
    And he wants to validate the elements card function
    When he selects one of the home
    Then he should see the name of the selected option in the header
