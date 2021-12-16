
Feature: Ebay Homepage Scenarios

 @P1 #This is a tag that can be used for running a set of tests having the same tag
#        The name of the tag can be any given name (it doesn't have a specific syntax)

 Scenario: Advanced search link

#   Given When And Then
    Given I am on ebay homepage
    When I click on Advanced Link
    Then I navigate to Advanced Search page

   @P2
 Scenario: Search items count

   Given I am on ebay homepage
   When I search for 'Iphone 11'
   Then I have at least 1000 search items returned
