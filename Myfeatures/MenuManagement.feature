Feature: MenuManagement

  Scenario: Add a new food item to the menu
    Given I am logged in as an administrator
    When I navigate to the menu management page
    And I click on the "Add New Item" button
    And I fill in the item details as follows:
      | Name       | Cheeseburger    |
      | Description| Delicious burger with cheese |
      | Price      | 9.99            |
    And I click on the "Save" button
    Then the item with name "Cheeseburger" should be added to the menu

  Scenario: Update an existing food item in the menu
    Given I am logged in as an administrator
    When I navigate to the menu management page
    And I search for the item with name "Cheeseburger"
    And I click on the "Edit" button for that item
    And I update the item details as follows:
      | Name       | Cheeseburger Deluxe |
      | Description| Delicious burger with cheese, lettuce, and tomato |
      | Price      | 12.99                |
    And I click on the "Save" button
    Then the item with name "Cheeseburger Deluxe" should be updated in the menu

  Scenario: Delete a food item from the menu
    Given I am logged in as an administrator
    When I navigate to the menu management page
    And I search for the item with name "Cheeseburger Deluxe"
    And I click on the "Delete" button for that item
    Then the item with name "Cheeseburger Deluxe" should be removed from the menu