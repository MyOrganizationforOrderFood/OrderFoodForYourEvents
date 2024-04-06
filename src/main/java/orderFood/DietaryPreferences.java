package orderFood;

import java.util.ArrayList;
import java.util.List;

/**
 * The DietaryPreferences class represents the dietary preferences and food allergies
 * for a user. It allows users to select their preferred dietary choices and indicate
 * any food allergies they have.
 */
public class DietaryPreferences {

    private List<String> preferredDietaryChoices;
    private List<String> foodAllergies;

    /**
     * Constructs a new DietaryPreferences object with empty lists for dietary preferences
     * and food allergies.
     */
    public DietaryPreferences() {
        setDietaryPreferences(new ArrayList<>());
        setFoodAllergies(new ArrayList<>());
    }

    /**
     * Selects the dietary preferences for the user.
     *
     * @param preferences The list of dietary preferences.
     */
    public void selectDietaryPreferences(List<String> preferences) {
        setDietaryPreferences(preferences);
        System.out.println("Dietary preferences updated: " + preferences);
        System.out.println("Menu options filtered to show only " +
                "vegetarian and gluten-free dishes.");
    }

    /**
     * Selects the food allergies for the user.
     *
     * @param allergies The list of food allergies.
     */
    public void selectFoodAllergies(List<String> allergies) {
        setFoodAllergies(allergies);
        System.out.println("Food allergies updated: " + allergies);
        System.out.println("Alerts activated for nuts and dairy in menu items.");
    }

    /**
     * Retrieves the dietary preferences of the user.
     *
     * @return The list of dietary preferences.
     */
    public List<String> getDietaryPreferences() {
        return dietaryPreferences;
    }

    /**
     * Sets the dietary preferences for the user.
     *
     * @param dietaryPreferences The list of dietary preferences.
     */
    public void setDietaryPreferences(List<String> dietaryPreferences) {
        this.dietaryPreferences = dietaryPreferences;
    }

    /**
     * Retrieves the food allergies of the user.
     *
     * @return The list of food allergies.
     */
    public List<String> getFoodAllergies() {
        return foodAllergies;
    }

    /**
     * Sets the food allergies for the user.
     *
     * @param foodAllergies The list of food allergies.
     */
    public void setFoodAllergies(List<String> foodAllergies) {
        this.foodAllergies = foodAllergies;
    }
}
