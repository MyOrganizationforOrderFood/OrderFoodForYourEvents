package orderFood;

import java.util.ArrayList;
import java.util.List;
public class PaymentSystem {
	 private List<String> supportedPaymentMethods;

	    public PaymentSystem() {
	        supportedPaymentMethods = new ArrayList<>();
	        supportedPaymentMethods.add("Credit Card");
	        supportedPaymentMethods.add("PayPal");
	        supportedPaymentMethods.add("Apple Pay");
	    }

	    public void processPayment(String selectedPaymentMethod) {
	        // Step: Given the customer selects products and proceeds to checkout
	        // (Implementation not provided)

	        // Step: And the customer chooses to pay via a supported payment method
	        if (isPaymentMethodSupported(selectedPaymentMethod)) {

	            // Step: When the customer completes the payment process
	            boolean paymentSuccessful = completePaymentProcess();

	            if (paymentSuccessful) {
	                // Step: Then the payment gateway processes the payment
	                processPaymentGateway();

	                // Step: And the system updates the order status to "Paid"
	                updateOrderStatus("Paid");

	                // Step: And the system generates a payment confirmation receipt for the customer
	                generatePaymentConfirmationReceipt();
	            } else {
	                // Step: When the payment process fails due to a declined transaction
	                // Step: Then the payment gateway sends a failure response
	                paymentFailedResponse();

	                // Step: And the system displays a payment failed message to the customer
	                displayPaymentFailedMessage();

	                // Step: And suggests the customer to try another payment method or check their payment details
	                suggestAlternativePaymentMethod();
	            }
	        } else {
	            // Step: And the customer chooses an unsupported payment method
	            displayUnsupportedPaymentMethodMessage();
	        }
	    }

	    private boolean isPaymentMethodSupported(String paymentMethod) {
	        return supportedPaymentMethods.contains(paymentMethod);
	    }

	    private boolean completePaymentProcess() {
	        // Implementation for completing the payment process
	        return true; // Assuming the payment process is successful
	    }

	    private void processPaymentGateway() {
	        // Implementation for processing the payment via the payment gateway
	    }

	    private void updateOrderStatus(String newStatus) {
	        // Implementation for updating the order status
	    }

	    private void generatePaymentConfirmationReceipt() {
	        // Implementation for generating the payment confirmation receipt
	    }

	    private void paymentFailedResponse() {
	        // Implementation for handling the payment failure response from the payment gateway
	    }

	    private void displayPaymentFailedMessage() {
	        // Implementation for displaying the payment failed message to the customer
	    }

	    private void suggestAlternativePaymentMethod() {
	        // Implementation for suggesting an alternative payment method to the customer
	    }

	    private void displayUnsupportedPaymentMethodMessage() {
	        // Implementation for displaying an unsupported payment method message to the customer
	    }
}
