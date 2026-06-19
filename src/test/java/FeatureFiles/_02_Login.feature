Feature: Login

  Scenario Outline: Login Test

    Given User enters "<username>"
    And User enters password "<password>"
    When User clicks Login
    Then User should see "<result>"

    Examples:
      | username | password | result |
      | validUser | validPass | success |
      | wrong     | validPass | fail    |
      | validUser | wrongPass | fail    |