Feature: UserRegistration
  As a user
  I want to register 
  So that I can access the system


  Scenario: User Login
    Given I am on the login page
    When I fill in the login form with valid credentials
    And I submit the form
    Then I should be redirected to the dashboard

  Scenario: Invalid Login
    Given I am on the login page
    When I fill in the login form with invalid credentials
    And I submit the form11
    Then I should see an error message
    And I should still be on the login page

