Scenario: User specifies dietary preferences
Given the user is logged in and navigates to their profile settings
When the user selects dietary preferences
And chooses "vegetarian" and "gluten-free" from the list
And saves the changes
Then the system updates the user's profile with the selected dietary preferences
And the menu options are filtered to show only vegetarian and gluten-free dishes

Scenario: User specifies food allergies
Given the user is logged in and navigates to their profile settings
When the user selects food allergies
And chooses "nuts" and "dairy" from the list
And saves the changes
Then the system updates the user's profile with the specified allergies
And alerts are activated to warn the user of nuts and dairy in menu items