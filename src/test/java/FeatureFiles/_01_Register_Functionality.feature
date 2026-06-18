Feature: Register

  Scenario: Register New User

    Given User clicks Register
    When User fills registration form
    And User clicks Register button
    Then Account should be create