Feature: Buy operations

  Scenario: Successfully buy 3 apples and there is stock
    Given Stock of apples is 5
    When Trying to buy 3
    Then Stock should be 2

  Scenario: Add 5 apples to stock
    Given Stock of apples is 3
    When Trying to add 5
    Then Stock should be 8

  Scenario: Try to buy 5 apples but there is no stock
    Given Stock of apples is 4
    When Trying to buy 5
    Then Get no stock message
    And Stock of apples remains in 4

  Scenario: Start with 4 apples then add 2 to buy 5 apples
    Given Stock of apples is 4
    When Trying to add 2
    And Trying to buy 6
    Then Stock should be 0