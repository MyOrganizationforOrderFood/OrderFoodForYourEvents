package orderFood;

import java.util.HashMap;
import java.util.Map;

/**
 * The InventoryManagement class represents the inventory management system for a food order service.
 * It allows tracking and updating stock levels for different items.
 */
public class InventoryManagement {

    private Map<String, Integer> stockLevels;

    /**
     * Constructs a new InventoryManagement object with an empty stock levels map.
     */
    public InventoryManagement() {
        stockLevels = new HashMap<>();
    }

    /**
     * Updates the stock level for an item.
     *
     * @param item     The item for which the stock level is updated.
     * @param quantity The quantity by which the stock level is updated.
     */
    public void updateStockLevel(String item, int quantity) {
        if (stockLevels.containsKey(item)) {
            int currentStockLevel = stockLevels.get(item);
            int newStockLevel = currentStockLevel - quantity;

            if (newStockLevel >= 0) {
                stockLevels.put(item, newStockLevel);
                System.out.println("Stock level for item '" + item + "' updated to " + newStockLevel);
            } else {
                System.out.println("Insufficient stock for item '" + item + "'");
            }
        } else {
            System.out.println("Item '" + item + "' not found in stock");
        }
    }

    /**
     * Displays the current stock levels for all items.
     */
    public void displayStockLevels() {
        System.out.println("Current Stock Levels:");
        for (Map.Entry<String, Integer> entry : stockLevels.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    /**
     * Initializes the stock levels with the provided initial stock levels map.
     *
     * @param initialStockLevels The map containing the initial stock levels for items.
     */
    public void initializeStockLevels(Map<String, Integer> initialStockLevels) {
        stockLevels.putAll(initialStockLevels);
    }
}