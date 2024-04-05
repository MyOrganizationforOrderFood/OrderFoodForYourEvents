package orderFood;

import java.util.HashMap;
import java.util.Map;

/**
 * The OrderTracking class represents the tracking system for orders in a food order service.
 * It allows tracking orders, updating order status, and displaying order details.
 */
public class OrderTracking {

    private Map<Integer, String> orderStatusMap;

    /**
     * Constructs a new OrderTracking object with an empty map of order statuses.
     */
    public OrderTracking() {
        orderStatusMap = new HashMap<>();
    }

    /**
     * Tracks the order with the specified customer ID and order ID.
     *
     * @param customerId The ID of the customer.
     * @param orderId    The ID of the order to track.
     */
    public void trackOrder(int customerId, int orderId) {
        displayOrderStatus(orderId);
        displayOrderDetails(orderId);
    }

    /**
     * Updates the status of the order with the specified admin ID, order ID, and new status.
     *
     * @param adminId   The ID of the admin updating the order status.
     * @param orderId   The ID of the order to update.
     * @param newStatus The new status for the order.
     */
    public void updateOrderStatus(int adminId, int orderId, String newStatus) {
        String currentStatus = getOrderStatus(orderId);

        if (currentStatus.equals("waiting")) {
            updateStatus(orderId, newStatus);
        }

        String updatedStatus = getOrderStatus(orderId);
        System.out.println("Updated order status: " + updatedStatus);
    }

    private void displayOrderStatus(int orderId) {
        String status = getOrderStatus(orderId);
        System.out.println("Order status: " + status);
    }

    private void displayOrderDetails(int orderId) {
        // Logic for displaying order details
    }

    private String getOrderStatus(int orderId) {
        return orderStatusMap.getOrDefault(orderId, "Order not found");
    }

    private void updateStatus(int orderId, String newStatus) {
        orderStatusMap.put(orderId, newStatus);
    }
}