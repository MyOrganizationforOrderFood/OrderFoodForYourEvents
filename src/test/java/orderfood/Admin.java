package orderfood;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import orderFood.MyApplication;



	public class Admin {
		
		MyApplication app ;
		public Admin () {
			app = new MyApplication ();
			
		}
		 @Before
		    public void setup() {
		        // Code to setup any necessary resources or test data
		    }

		    @After
		    public void teardown() {
		        // Code to clean up resources or reset the system state
		    }

		    @Given("I am logged in to the admin dashboard")
		    public void iAmLoggedInToTheAdminDashboard1() {
		        // Write code here that turns the phrase above into concrete actions
		        throw new io.cucumber.java.PendingException();
		    }
		    @Given("I am on the {string} page")
		    public void iAmOnThePage1(String string) {
		        // Write code here that turns the phrase above into concrete actions
		        throw new io.cucumber.java.PendingException();
		    }
		    @When("I click on the {string} button")
		    public void iClickOnTheButton(String string) {
		        // Write code here that turns the phrase above into concrete actions
		        throw new io.cucumber.java.PendingException();
		    }
		    @When("I fill in the event name as {string}")
		    public void iFillInTheEventNameAs(String string) {
		        // Write code here that turns the phrase above into concrete actions
		        throw new io.cucumber.java.PendingException();
		    }
		    @When("I select the food items {string}, {string}, and {string}")
		    public void iSelectTheFoodItemsAnd(String string, String string2, String string3) {
		        // Write code here that turns the phrase above into concrete actions
		        throw new io.cucumber.java.PendingException();
		    }
		    @When("I specify the quantity for each food item")
		    public void iSpecifyTheQuantityForEachFoodItem() {
		        // Write code here that turns the phrase above into concrete actions
		        throw new io.cucumber.java.PendingException();
		    }
		    @When("I click the {string} button")
		    public void iClickTheButton1(String string) {
		        // Write code here that turns the phrase above into concrete actions
		        throw new io.cucumber.java.PendingException();
		    }
		    @Then("the food order for the event {string} should be added successfully")
		    public void theFoodOrderForTheEventShouldBeAddedSuccessfully(String string) {
		        // Write code here that turns the phrase above into concrete actions
		        throw new io.cucumber.java.PendingException();
		    }


		    @Given("I am logged in to the admin dashboard")
		    public void iAmLoggedInToTheAdminDashboard11() {
		        // Write code here that turns the phrase above into concrete actions
		        throw new io.cucumber.java.PendingException();
		    }
		    @Given("I am on the {string} page")
		    public void iAmOnThePage11(String string) {
		        // Write code here that turns the phrase above into concrete actions
		        throw new io.cucumber.java.PendingException();
		    }
		    @Given("there is a food order for the event {string}")
		    public void thereIsAFoodOrderForTheEvent1(String string) {
		        // Write code here that turns the phrase above into concrete actions
		        throw new io.cucumber.java.PendingException();
		    }
		    @When("I click on the {string} button for the {string} order")
		    public void iClickOnTheButtonForTheOrder1(String string, String string2) {
		        // Write code here that turns the phrase above into concrete actions
		        throw new io.cucumber.java.PendingException();
		    }
		    @When("I update the food items to {string}, {string}, and {string}")
		    public void iUpdateTheFoodItemsToAnd(String string, String string2, String string3) {
		        // Write code here that turns the phrase above into concrete actions
		        throw new io.cucumber.java.PendingException();
		    }
		    @When("I update the quantities for the food items")
		    public void iUpdateTheQuantitiesForTheFoodItems() {
		        // Write code here that turns the phrase above into concrete actions
		        throw new io.cucumber.java.PendingException();
		    }
		    @When("I click the {string} button")
		    public void iClickTheButton(String string) {
		        // Write code here that turns the phrase above into concrete actions
		        throw new io.cucumber.java.PendingException();
		    }
		    @Then("the food order for the event {string} should be updated successfully with the new food items and quantities")
		    public void theFoodOrderForTheEventShouldBeUpdatedSuccessfullyWithTheNewFoodItemsAndQuantities(String string) {
		        // Write code here that turns the phrase above into concrete actions
		        throw new io.cucumber.java.PendingException();
		    }


	@Given("I am logged in to the admin dashboard")
	public void iAmLoggedInToTheAdminDashboard() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Given("I am on the {string} page")
	public void iAmOnThePage(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Given("there is a food order for the event {string}")
	public void thereIsAFoodOrderForTheEvent(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@When("I click on the {string} button for the {string} order")
	public void iClickOnTheButtonForTheOrder(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Then("the food order for the event {string} should be deleted successfully")
	public void theFoodOrderForTheEventShouldBeDeletedSuccessfully(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	}
