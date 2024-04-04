package orderFood;

class Review {
    private String email;
    private String comment;
    private int rating;

    public Review(String email, String comment, int rating) {
        this.email = email;
        this.comment = comment;
        this.rating = rating;
    }

    public String getEmail() {
        return email;
    }

    public String getComment() {
        return comment;
    }

    public int getRating() {
        return rating;
    }
}

