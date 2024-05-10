Feature: An I a paguro?
  Everybody wants to be a paguro

  Scenario: Sadly, I'm not a paguro
    Given I'm not a paguro
    When I ask if I am a paguro
    Then I should be told "Nope"
