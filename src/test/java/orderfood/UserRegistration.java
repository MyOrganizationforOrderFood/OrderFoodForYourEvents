package orderfood;




	import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import orderFood.MyApplication;

	public class UserRegistration {
		MyApplication app ;
		public UserRegistration () {
			app = new MyApplication ();
			
		}


	    @Before
	    public void setUp(Scenario scenario) {
	        // Set up any necessary setup before each scenario
	    	throw new io.cucumber.java.PendingException();
	    }

	    @After
	    public void tearDown(Scenario scenario) {
	        // Perform any necessary teardown after each scenario
	    }

	    @Given("I am on the login page")
	    public void iAmOnTheLoginPage1() {
	        // Write code here that turns the phrase above into concrete actions
	        throw new io.cucumber.java.PendingException();
	    }
	    @When("I fill in the login form with valid credentials")
	    public void iFillInTheLoginFormWithValidCredentials() {
	        // Write code here that turns the phrase above into concrete actions
	        throw new io.cucumber.java.PendingException();
	    }
	    @When("I submit the form")
	    public void iSubmitTheForm() {
	        // Write code here that turns the phrase above into concrete actions
	        throw new io.cucumber.java.PendingException();
	    }
	    @Then("I should be redirected to the dashboard")
	    public void iShouldBeRedirectedToTheDashboard() {
	        // Write code here that turns the phrase above into concrete actions
	        throw new io.cucumber.java.PendingException();
	    }

	    @Given("I am on the login page")
	    public void iAmOnTheLoginPage() {
	        // Write code here that turns the phrase above into concrete actions
	        throw new io.cucumber.java.PendingException();
	    }
	    @When("I fill in the login form with invalid credentials")
	    public void iFillInTheLoginFormWithInvalidCredentials() {
	        // Write code here that turns the phrase above into concrete actions
	        throw new io.cucumber.java.PendingException();
	    }
	    @When("I submit the form11")
	    public void iSubmitTheForm11() {
	        // Write code here that turns the phrase above into concrete actions
	        throw new io.cucumber.java.PendingException();
	    }
	    @Then("I should see an error message")
	    public void iShouldSeeAnErrorMessage() {
	        // Write code here that turns the phrase above into concrete actions
	        throw new io.cucumber.java.PendingException();
	    }
	    @Then("I should still be on the login page")
	    public void iShouldStillBeOnTheLoginPage() {
	        // Write code here that turns the phrase above into concrete actions
	        throw new io.cucumber.java.PendingException();
	    }
	}
