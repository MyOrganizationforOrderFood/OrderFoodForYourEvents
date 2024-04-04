Feature: OrderPlacement

  Scenario: Place a food order for an event
    Given I am a logged-in user
    And I have selected the event "Birthday Party"
    When I browse the menu
    And I add the following items to my order:
      | Item          | Quantity |
      | Cheeseburger  | 2        |
      | French Fries  | 1        |
      | Soda          | 4        |
    And I provide special instructions for the order:
      """
      No onions on the cheeseburger
      Extra ketchup for the French fries
      """
    And I proceed to checkout
    And I provide the delivery address as "123 Main St, City"
    And I select the payment method as "Credit Card"
    And I complete the order
    Then I should receive an order confirmation
    And the order status should be "Confirmed"