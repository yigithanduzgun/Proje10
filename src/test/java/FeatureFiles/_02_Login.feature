Feature: Login

  Scenario Outline: Login Test

    Given Navigate To Website
    When User enters "<username>"
    And User enters password "<password>"
    When User clicks Login
    Then User should see "<result>"

    Examples:
      | username      | password    | result                                             |
      | hiyarmavenci  | 123456      | The username and password could not be verified.   |
      | hiyar.mavenci | 123455      | The username and password could not be verified.   |
      | hiyar.mavenci | 123456      | You are now logged in.                             |
