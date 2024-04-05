Feature: Admin
  As an admin user
  I want to manage food orders for events
  So that I can add, edit, and delete food orders

  Scenario: Add a new food order for an event
    Given I am logged in to the admin dashboard
    And I am on the "Food Orders" page
    When I click on the "Add New Order" button
    And I fill in the event name as "Annual Gala"
    And I select the food items "Steak", "Salad", and "Cheesecake"
    And I specify the quantity for each food item
    And I click the "Submit" button
    Then the food order for the event "Annual Gala" should be added successfully

  Scenario: Edit an existing food order for an event
    Given I am logged in to the admin dashboard
    And I am on the "Food Orders" page
    And there is a food order for the event "Annual Gala"
    When I click on the "Edit" button for the "Annual Gala" order
    And I update the food items to "Fish", "Rice", and "Tiramisu"
    And I update the quantities for the food items
    And I click the "Save" button
    Then the food order for the event "Annual Gala" should be updated successfully with the new food items and quantities

  Scenario: Delete a food order for an event
    Given I am logged in to the admin dashboard
    And I am on the "Food Orders" page
    And there is a food order for the event "Annual Gala"
    When I click on the "Delete" button for the "Annual Gala" order
    Then the food order for the event "Annual Gala" should be deleted successfully
    And the "Annual Gala" order should no longer be visible in the food orders list