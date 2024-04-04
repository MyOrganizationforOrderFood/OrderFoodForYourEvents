package orderFood;

	
	
public class UserRegitration {

		  private String firstName;
		  private String lastName;
		  private boolean isRegistered;
		  
		  // Constructor
		  public UserRegitration(String firstName, String lastName) {
		    this.firstName = firstName;
		    this.lastName = lastName;
		    this.isRegistered = false;
		  }
		  
		  // Getters and Setters
		  public String getFirstName() {
		    return firstName;
		  }

		  public void setFirstName(String firstName) {
		    this.firstName = firstName;
		  }

		  public String getLastName() {
		    return lastName;
		  }

		  public void setLastName(String lastName) {
		    this.lastName = lastName;
		  }

		 
		  public boolean isRegistered() {
		    return isRegistered;
		  }

		  public void setRegistered(boolean registered) {
		    isRegistered = registered;
		  }

		 
		}

