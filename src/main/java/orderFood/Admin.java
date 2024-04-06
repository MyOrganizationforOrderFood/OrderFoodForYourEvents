package orderFood;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The Admin class represents an administrator of a food ordering system. It allows
 * the admin to manage food orders for different events.
 */
public class Admin {

    private Map<String, List<String>> foodOrders;

    /**
     * Constructs a new Admin object.
     */
    public Admin() {
        foodOrders = new HashMap<>();
    }

    /**
     * Adds a food order for a specific event.
     *
     * @param eventName  The name of the event.
     * @param foodItems  The list of food items for the order.
     * @param quantities The list of quantities corresponding to each food item.
     */
   public void addFoodOrder(String eventName, List<String> foodItems, List<Integer> quantities) {
    foodOrders.put(eventName, foodItems);
    final String MESSAGE_TEMPLATE = "Food order for the event \"%s\" added successfully.";
    final String message = String.format(MESSAGE_TEMPLATE, eventName);
    System.out.println(message);
}

    /**
     * Updates a food order for a specific event.
     *
     * @param eventName  The name of the event.
     * @param foodItems  The updated list of food items for the order.
     * @param quantities The updated list of quantities corresponding to each food item.
     */
    public void updateFoodOrder(String eventName, List<String> foodItems, List<Integer> quantities) {
        foodOrders.put(eventName, foodItems);
        System.out.println("Food order for the event \"" + eventName + "\" updated successfully.");
    }

    /**
     * Deletes a food order for a specific event.
     *
     * @param eventName The name of the event.
     */
    public void deleteFoodOrder(String eventName) {
        foodOrders.remove(eventName);
        System.out.println("Food order for the event \"" + eventName + "\" deleted successfully.");
    }
}
