package orderFood;
import java.util.HashMap;
import java.util.Map;

public class OrderTracking{

	private Map<Integer, String> orderStatusMap;

    public OrderTracking() {
        orderStatusMap = new HashMap<>();
    }

    public void trackOrder(int customerId, int orderId) {
        // Step: Given the customer with id=101 (customerId)
        // (Implementation not provided)

        // Step: And the order has a unique Id 11 (orderId)
        // (Implementation not provided)

        // Step: When the customer enters the Id number =11 (orderId)
        displayOrderStatus(orderId);

        // Step: Then the system displays the status of the order
        // (Implementation not provided)

        // Step: And the system displays the other order details
        displayOrderDetails(orderId);
    }

    public void updateOrderStatus(int adminId, int orderId, String newStatus) {
        // Step: Given admin login and enter the order id =12 (adminId, orderId)
        // (Implementation not provided)

        // Step: When the admin select to update order status
        // (Implementation not provided)

        // Step: And the order status is "waiting"
        String currentStatus = getOrderStatus(orderId);
        if (currentStatus.equals("waiting")) {

            // Step: And the order is updated to status "in terminate" (newStatus)
            updateStatus(orderId, newStatus);
        }

        // Step: Then the order status should be "in terminate"
        String updatedStatus = getOrderStatus(orderId);
        System.out.println("Updated order status: " + updatedStatus);
    }

    private void displayOrderStatus(int orderId) {
        String status = getOrderStatus(orderId);
        System.out.println("Order status: " + status);
    }

    private void displayOrderDetails(int orderId) {
        // Implementation for displaying order details
    }

    private String getOrderStatus(int orderId) {
        return orderStatusMap.getOrDefault(orderId, "Order not found");
    }

    private void updateStatus(int orderId, String newStatus) {
        orderStatusMap.put(orderId, newStatus);
    }

   
}
