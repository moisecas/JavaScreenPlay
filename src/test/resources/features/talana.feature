Feature: Login to Talana website

  Scenario: Validate that the user can access the login screen
    Given "User" opens the main page of Talana Pe
    When he selects the login button
    Then he should see the login screen with the username field available
