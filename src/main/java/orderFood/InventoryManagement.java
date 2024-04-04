package orderFood;
import java.util.HashMap;
import java.util.Map;


public class InventoryManagement {
	
	 private Map<String, Integer> stockLevels; // Stores the stock levels for each item

	    public InventoryManagement() {
	        stockLevels = new HashMap<>();
	    }

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
	

	    public void displayStockLevels() {
	        System.out.println("Current Stock Levels:");
	        for (Map.Entry<String, Integer> entry : stockLevels.entrySet()) {
	            System.out.println(entry.getKey() + ": " + entry.getValue());
	        }
	    }

	    public void initializeStockLevels(Map<String, Integer> initialStockLevels) {
	        stockLevels.putAll(initialStockLevels);
	    }
	    
}
