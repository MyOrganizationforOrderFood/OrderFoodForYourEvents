Scenario: Successful payment transaction
Given the customer selects products and proceeds to checkout
And the customer chooses to pay via a supported payment method
When the customer completes the payment process
Then the payment gateway processes the payment
And the system updates the order status to "Paid"
And the system generates a payment confirmation receipt for the customer

Scenario: Failed payment transaction
Given the customer selects products and proceeds to checkout
And the customer chooses to pay via a supported payment method
When the payment process fails due to a declined transaction
Then the payment gateway sends a failure response
And the system displays a payment failed message to the customer
And suggests the customer to try another payment method or check their payment details