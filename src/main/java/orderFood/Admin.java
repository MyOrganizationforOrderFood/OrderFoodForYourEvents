package orderFood;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;


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
    Logger logger = Logger.getLogger(getClass().getName());
    final String MESSAGE_TEMPLATE = "Food order for the event \"%s\" added successfully.";
    final String message = String.format(MESSAGE_TEMPLATE, eventName);
    logger.info(message);
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
    Logger logger = Logger.getLogger(getClass().getName());
    final String MESSAGE_TEMPLATE = "Food order for the event \"%s\" updated successfully.";
    final String message = String.format(MESSAGE_TEMPLATE, eventName);
    logger.info(message);
}
    /**
     * Deletes a food order for a specific event.
     *
     * @param eventName The name of the event.
     */
   public void deleteFoodOrder(String eventName) {
    foodOrders.remove(eventName);
    Logger logger = Logger.getLogger(getClass().getName());
    final String MESSAGE_TEMPLATE = "Food order for the event \"%s\" deleted successfully.";
    final String message = String.format(MESSAGE_TEMPLATE, eventName);
    logger.info(message);
}
}
