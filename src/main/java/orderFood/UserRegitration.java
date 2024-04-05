package orderFood;

/**
 * The UserRegistration class represents a user's registration in a food order service.
 * It contains the user's first name, last name, and registration status.
 */
public class UserRegitration{

    private String firstName;
    private String lastName;
    private boolean isRegistered;

    /**
     * Constructs a new UserRegistration object with the specified first name and last name.
     *
     * @param firstName The user's first name.
     * @param lastName  The user's last name.
     */
    public UserRegitration(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.isRegistered = false;
    }

    /**
     * Returns the user's first name.
     *
     * @return The user's first name.
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the user's first name.
     *
     * @param firstName The user's first name.
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Returns the user's last name.
     *
     * @return The user's last name.
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the user's last name.
     *
     * @param lastName The user's last name.
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Checks if the user is registered.
     *
     * @return true if the user is registered, false otherwise.
     */
    public boolean isRegistered() {
        return isRegistered;
    }

    /**
     * Sets the registration status of the user.
     *
     * @param registered The registration status of the user.
     */
    public void setRegistered(boolean registered) {
        isRegistered = registered;
    }
}