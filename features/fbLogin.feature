Feature: login
  @fb
  Scenario: Login with facebook
    Given I navigate into the app
    When I click on Facebook Sign Up button
    Then The account should be created with Facebook account