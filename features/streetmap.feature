Feature: Search an address in openstreetmap.org
  @t2
  Scenario: Search an address and press "Go"

    Given I am on openstreetmap.org
    When I insert some data in the text box
    And I click on the "Go" button
    Then I should have results returned
