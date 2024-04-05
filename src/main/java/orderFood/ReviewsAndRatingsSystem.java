package orderFood;

/**
 * The Review class represents a customer review for a food order.
 * It contains the email of the reviewer, the comment, and the rating.
 */
public class ReviewsAndRatingsSystem{
    private String email;
    private String comment;
    private int rating;

    /**
     * Constructs a new Review object with the specified email, comment, and rating.
     *
     * @param email   The email of the reviewer.
     * @param comment The comment provided by the reviewer.
     * @param rating  The rating given by the reviewer.
     */
    public ReviewsAndRatingsSystem(String email, String comment, int rating) {
        this.email = email;
        this.comment = comment;
        this.rating = rating;
    }

    /**
     * Returns the email of the reviewer.
     *
     * @return The email of the reviewer.
     */
    public String getEmail() {
        return email;
    }

    /**
     * Returns the comment provided by the reviewer.
     *
     * @return The comment provided by the reviewer.
     */
    public String getComment() {
        return comment;
    }

    /**
     * Returns the rating given by the reviewer.
     *
     * @return The rating given by the reviewer.
     */
    public int getRating() {
        return rating;
    }
}