Feature: Ebay Advanced Search Page

  @P24
  Scenario: Ebay Logo on Advanced Search Page

    Given I am on Ebay Advanced Search Page
    When I click on Ebay Logo
    Then I am navigated to Ebay homepage

  @P25

  Scenario: Advanced search an item
    Given I am on Ebay Advanced Search Page
    When I advance search an item
    Then I am navigated to Ebay homepage
      | keyword  | exclude     | min | max |
      | iPhone11 | refurbished | 300 | 900 |