package orderFood;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Admin {

	private Map<String, List<String>> foodOrders;

    public Admin() {
        foodOrders = new HashMap<>();
    }

    public void addFoodOrder(String eventName, List<String> foodItems, List<Integer> quantities) {
        foodOrders.put(eventName, foodItems);
        System.out.println("Food order for the event \"" + eventName + "\" added successfully.");
    }

    public void updateFoodOrder(String eventName, List<String> foodItems, List<Integer> quantities) {
        foodOrders.put(eventName, foodItems);
        System.out.println("Food order for the event \"" + eventName + "\" updated successfully.");
    }

    public void deleteFoodOrder(String eventName) {
        foodOrders.remove(eventName);
        System.out.println("Food order for the event \"" + eventName + "\" deleted successfully.");
    }

    
   
}
