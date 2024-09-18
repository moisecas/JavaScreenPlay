Feature: Navigation on the DemoBlaze website

  Scenario: Validate that the user can navigate to the laptops section
    Given "moises" opens the main page of DemoBlaze
    When he selects the "Laptops" category
    Then he should see the list of laptops on the page

