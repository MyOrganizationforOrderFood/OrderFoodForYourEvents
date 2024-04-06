package orderFood;

import java.util.HashMap;
import java.util.Map;

/**
 * The MenuManagement class represents the menu management system for a food order service.
 * It allows adding, updating, and deleting menu items.
 */
public class MenuManagement {

    private Map<String, MenuItem> menuItems;

    /**
     * Constructs a new MenuManagement object with an empty map of menu items.
     */
    public MenuManagement() {
        menuItems = new HashMap<>();
    }

    /**
     * Adds a new item to the menu.
     *
     * @param name        The name of the item.
     * @param description The description of the item.
     * @param price       The price of the item.
     */
    public void addNewItem(String name, String description, double price) {
        MenuItem newItem = new MenuItem(name, description, price);
        menuItems.put(name, newItem);
    }

    /**
     * Updates an existing item in the menu.
     *
     * @param name           The name of the item to be updated.
     * @param newDescription The new description for the item.
     * @param newPrice       The new price for the item.
     */
    public void updateItem(String name, String newDescription, double newPrice) {
        if (menuItems.containsKey(name)) {
            MenuItem item = menuItems.get(name);
            item.setDescription(newDescription);
            item.setPrice(newPrice);
        }
    }

    /**
     * Deletes an item from the menu.
     *
     * @param name The name of the item to be deleted.
     */
    public void deleteItem(String name) {
        menuItems.remove(name);
    }

    /**
     * Checks if an item exists in the menu.
     *
     * @param name The name of the item to check.
     * @return true if the item exists, false otherwise.
     */
    public boolean itemExists(String name) {
        return menuItems.containsKey(name);
    }

   private static class MenuItem {
    public MenuItem(String name) {
        this.setName(name);
    }
}

        private void setName(String name) {
            // TODO Auto-generated method stub

        }

        public void setPrice(double newPrice) {
            // TODO Auto-generated method stub

        }

        public void setDescription(String newDescription) {
            // TODO Auto-generated method stub

        }
    }
}
