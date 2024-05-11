Feature: Is the Paguro hungry?

  Scenario: Kappa is not hungry
    Given Paguro is not hungry
    When I ask if the Paguro is hungry
    Then I should be told "Nope"

  Scenario: Paguro is hungry
    Given Paguro is hungry
    When I ask if the Paguro is hungry
    Then I should be told "Yess"