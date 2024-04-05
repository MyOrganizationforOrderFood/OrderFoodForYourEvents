package orderFood;

/**
 * The OrderPlacement class represents the process of placing an order in a food order service.
 * It allows browsing the menu, adding items to the order, providing special instructions,
 * selecting delivery address and payment method, and completing the order.
 */
public class OrderPlacement {

    private String menu;
    private String order;
    private String specialInstructions;
    private String deliveryAddress;
    private String paymentMethod;
    private boolean orderCompleted;

    /**
     * Displays the menu items.
     */
    public void browseMenu() {
        menu = "Menu items are displayed";
    }

    /**
     * Adds an item with the specified quantity to the order.
     *
     * @param item     The name of the item to be added.
     * @param quantity The quantity of the item to be added.
     */
    public void addItemToOrder(String item, int quantity) {
        order = "Added " + quantity + " " + item + " to the order";
    }

    /**
     * Provides special instructions for the order.
     *
     * @param instructions The special instructions for the order.
     */
    public void provideSpecialInstructions(String instructions) {
        specialInstructions = instructions;
    }

    /**
     * Proceeds to the checkout process.
     */
    public void proceedToCheckout() {
        // Logic for proceeding to the checkout process
    }

    /**
     * Provides the delivery address for the order.
     *
     * @param address The delivery address for the order.
     */
    public void provideDeliveryAddress(String address) {
        deliveryAddress = address;
    }

    /**
     * Selects the payment method for the order.
     *
     * @param method The payment method for the order.
     */
    public void selectPaymentMethod(String method) {
        paymentMethod = method;
    }

    /**
     * Marks the order as completed.
     */
    public void completeOrder() {
        orderCompleted = true;
    }

    /**
     * Retrieves the menu.
     *
     * @return The menu.
     */
    public String getMenu() {
        return menu;
    }

    /**
     * Retrieves the order.
     *
     * @return The order.
     */
    public String getOrder() {
        return order;
    }

    /**
     * Retrieves the special instructions.
     *
     * @return The special instructions.
     */
    public String getSpecialInstructions() {
        return specialInstructions;
    }

    /**
     * Retrieves the delivery address.
     *
     * @return The delivery address.
     */
    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    /**
     * Retrieves the payment method.
     *
     * @return The payment method.
     */
    public String getPaymentMethod() {
        return paymentMethod;
    }

    /**
     * Checks if the order is completed.
     *
     * @return true if the order is completed, false otherwise.
     */
    public boolean isOrderCompleted() {
        return orderCompleted;
    }
}