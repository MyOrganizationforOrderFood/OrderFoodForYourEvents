package orderFood;

import java.util.ArrayList;


import java.util.List;


public class DietaryPreferences {

	  private List<String> dietaryPreferences;
	    private List<String> foodAllergies;

	    public DietaryPreferences() {
	        setDietaryPreferences(new ArrayList<>());
	        setFoodAllergies(new ArrayList<>());
	    }

	    public void selectDietaryPreferences(List<String> preferences) {
	        setDietaryPreferences(preferences);
	        System.out.println("Dietary preferences updated: " + preferences);
	        System.out.println("Menu options filtered to show only " +
	                "vegetarian and gluten-free dishes.");
	    }

	    public void selectFoodAllergies(List<String> allergies) {
	        setFoodAllergies(allergies);
	        System.out.println("Food allergies updated: " + allergies);
	        System.out.println("Alerts activated for nuts and dairy in menu items.");
	
}

		public List<String> getDietaryPreferences() {
			return dietaryPreferences;
		}

		public void setDietaryPreferences(List<String> dietaryPreferences) {
			this.dietaryPreferences = dietaryPreferences;
		}

		public List<String> getFoodAllergies() {
			return foodAllergies;
		}

		public void setFoodAllergies(List<String> foodAllergies) {
			this.foodAllergies = foodAllergies;
		}
}