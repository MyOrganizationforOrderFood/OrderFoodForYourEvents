Feature: InventoryManagement

Scenario: Updating stock levels when orders are placed
Given a restaurant or catering service
And an inventory management system
And a list of available items in stock
And the initial stock levels for each item
When an order is placed for a specific item
And the quantity of the item is specified
Then the stock level of the item should be reduced by the quantity specified
And the inventory management system should be updated with the new stock level

Scenario: Insufficient stock for an order
Given a restaurant or catering service
And an inventory management system
And a list of available items in stock
And the initial stock levels for each item
And an order is placed for a specific item
And the quantity of the item is specified
And the quantity specified exceeds the available stock level
Then an error should be displayed indicating insufficient stock

Scenario: Tracking stock levels accurately
Given a restaurant or catering service
And an inventory management system
And a list of available items in stock
And the initial stock levels for each item
When multiple orders are placed for different items
And the quantities for each item are specified
Then the stock levels for each item should be updated accordingly
And the inventory management system should reflect the accurate stock levels