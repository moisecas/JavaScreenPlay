@authenticationLogin
Feature: Successful Authentication

  As a Test Automation Engineer (TAE)
  I want to perform an authentication test on the website
  So that I can verify the robustness and error control of the web application, ensuring it functions correctly

  Background:
    Given "moiso" opens the test website

  @authenticationSuccess
  Scenario: Successful user authentication
    When the user enters their credentials
    Then the homepage is displayed and the user waits for validation

