package orderFood;

import java.util.HashMap;
import java.util.Map;

public class MenuManagement {

	private Map<String, MenuItem> menuItems;

    public MenuManagement() {
        menuItems = new HashMap<>();
    }

    public void addNewItem(String name, String description, double price) {
        MenuItem newItem = new MenuItem(name, description, price);
        menuItems.put(name, newItem);
    }

    public void updateItem(String name, String newDescription, double newPrice) {
        if (menuItems.containsKey(name)) {
            MenuItem item = menuItems.get(name);
            item.setDescription(newDescription);
            item.setPrice(newPrice);
        }
    }

    public void deleteItem(String name) {
        menuItems.remove(name);
    }

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

