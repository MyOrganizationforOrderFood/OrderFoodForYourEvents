package orderFood;

import java.util.ArrayList;
import java.util.List;

/**
 * The PaymentSystem class represents the payment processing system in a food order service.
 * It allows processing payments, updating order status, and generating payment confirmation receipts.
 */
public class PaymentSystem {

    private List<String> supportedPaymentMethods;

    /**
     * Constructs a new PaymentSystem object with a list of supported payment methods.
     */
    public PaymentSystem() {
        supportedPaymentMethods = new ArrayList<>();
        supportedPaymentMethods.add("Credit Card");
        supportedPaymentMethods.add("PayPal");
        supportedPaymentMethods.add("Apple Pay");
    }

    /**
     * Processes the payment using the selected payment method.
     *
     * @param selectedPaymentMethod The selected payment method.
     */
    public void processPayment(String selectedPaymentMethod) {
        if (isPaymentMethodSupported(selectedPaymentMethod)) {

            boolean paymentSuccessful = completePaymentProcess();

            if (paymentSuccessful) {
                processPaymentGateway();
                updateOrderStatus("Paid");
                generatePaymentConfirmationReceipt();
            } else {
                paymentFailedResponse();
                displayPaymentFailedMessage();
                suggestAlternativePaymentMethod();
            }
        } else {
            displayUnsupportedPaymentMethodMessage();
        }
    }

    private boolean isPaymentMethodSupported(String paymentMethod) {
        return supportedPaymentMethods.contains(paymentMethod);
    }

    private boolean completePaymentProcess() {
        return true;
    }

    private void processPaymentGateway() {
        // Logic for processing the payment gateway
    }

    private void updateOrderStatus(String newStatus) {
        // Logic for updating the order status
    }

    private void generatePaymentConfirmationReceipt() {
        // Logic for generating the payment confirmation receipt
    }

    private void paymentFailedResponse() {
        // Logic for handling the payment failure response
    }

    private void displayPaymentFailedMessage() {
        // Logic for displaying a payment failed message
    }

    private void suggestAlternativePaymentMethod() {
        // Logic for suggesting an alternative payment method
    }

    private void displayUnsupportedPaymentMethodMessage() {
        // Logic for displaying an unsupported payment method message
    }
}