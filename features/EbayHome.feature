
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
#If I want to pass a value as a parameter, I can just put it between single quotes
# for numbers, we do not need to put the value under single quotes as long as I define the step with an argument in the step definition

   Given I am on ebay homepage
   When I search for 'Iphone 11'
   Then I have at least 1000 search items returned

  @P3
  Scenario: Search items count2
#If I want to pass a value as a parameter, I can just put it between single quotes
# for numbers, we do not need to put the value under single quotes as long as I define the step with an argument in the step definition

    Given I am on ebay homepage
    When I search for 'Toy Cars'
    Then I have at least 100 search items returned


  @P4
  Scenario: Search items in category
#If I want to pass a value as a parameter, I can just put it between single quotes
# for numbers, we do not need to put the value under single quotes as long as I define the step with an argument in the step definition

    Given I am on ebay homepage
    When I search for 'soap' in 'baby' category
    Then I have at least 100 search items returned