Feature: search test

  As a user i must be able to search and get the result for a valid product

  Scenario Outline: Valid product search
    Given I am on home page "https://www.tkmaxx.com/uk/en/"
    When I enter the product to be search in search tab "<product>"
    And I click on search button
    Then I could be able to get the result of list of product that i searched for

    Examples:
    |product|
    |Jeans  |
