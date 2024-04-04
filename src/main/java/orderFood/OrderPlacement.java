package orderFood;




public class OrderPlacement {

	 private String menu;
	    private String order;
	    private String specialInstructions;
	    private String deliveryAddress;
	    private String paymentMethod;
	    private boolean orderCompleted;

	    public void browseMenu() {
	        // Code to browse the menu
	        menu = "Menu items are displayed";
	    }

	    public void addItemToOrder(String item, int quantity) {
	        // Code to add an item to the order
	        order = "Added " + quantity + " " + item + " to the order";
	    }

	    public void provideSpecialInstructions(String instructions) {
	        // Code to provide special instructions for the order
	        specialInstructions = instructions;
	    }

	    public void proceedToCheckout() {
	        // Code to proceed to checkout
	        // Perform any necessary calculations or validations
	    }

	    public void provideDeliveryAddress(String address) {
	        // Code to provide the delivery address
	        deliveryAddress = address;
	    }

	    public void selectPaymentMethod(String method) {
	        // Code to select the payment method
	        paymentMethod = method;
	    }

	    public void completeOrder() {
	        // Code to complete the order
	        // Perform any necessary actions, such as sending an order confirmation email
	        orderCompleted = true;
	    }

	    // Getter methods to retrieve the order details

	    public String getMenu() {
	        return menu;
	    }

	    public String getOrder() {
	        return order;
	    }

	    public String getSpecialInstructions() {
	        return specialInstructions;
	    }

	    public String getDeliveryAddress() {
	        return deliveryAddress;
	    }

	    public String getPaymentMethod() {
	        return paymentMethod;
	    }

	    public boolean isOrderCompleted() {
	        return orderCompleted;
	    }
	
}
