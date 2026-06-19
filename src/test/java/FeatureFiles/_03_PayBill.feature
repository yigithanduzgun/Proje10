Feature: Bill Pay

  Scenario Outline: Bill Payment

    Given User logs in
    And User opens Bill Pay page
    When User pays "<bill>" amount "<amount>"
    Then Payment should be successful

    Examples:
      | bill      | amount |
      | Electric  | 85     |
      | Water     | 45     |
      | NaturalGas| 120    |