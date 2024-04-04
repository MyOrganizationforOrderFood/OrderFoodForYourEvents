Feature: delivary 

Scenario: User selects delivery option
Given the user is in the checkout process
When the user selects "Delivery" as their preferred option
And enters a valid delivery address
Then the system confirms the delivery address
And displays an estimated delivery time

Scenario: User selects pickup option
Given the user is in the checkout process
When the user selects "Pickup" as their preferred option
And chooses a pickup location from a list of available locations
Then the system confirms the pickup location
And displays the available pickup time slots
And the user selects a preferred pickup time 