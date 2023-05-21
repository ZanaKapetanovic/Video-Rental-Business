/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Zana Kapetanovic
 */
//Video rental business exercise
public abstract class Movie {
    private String rating;
    private int idNumber;
    String movieTitle;

    public Movie() {
        setId(0);
        setTitle("No name");
        setRating("No name");
    }

    public Movie(int idN, String t, String r) {
        setId(idN);
        setTitle(t);
        setRating(r);
    }

    public Movie(Movie originalObject) {
        if (originalObject != null) {
            this.idNumber = originalObject.idNumber;
            this.movieTitle = originalObject.movieTitle;
            this.rating = originalObject.rating;
        } else {
            System.out.println("Error");
            System.exit(0);
        }
    }

    public void setId(int idN) {
        this.idNumber = idN;
    }

    public void setTitle(String t) {
        this.movieTitle = t;
    }
    public void setRating(String r)
    {
        this.rating = r;
    }
    public int getId() {
        return idNumber;
    }

    public String getTitle() {
        return movieTitle;
    }
    public String getRating()
    {
        return rating;
    }
    public abstract double calcLateFees(int daysLate);
    public abstract Movie clone();

    @Override
    public boolean equals(Object otherObject) {
        if (otherObject == null) {
            return false;
        } else if (getClass() != otherObject.getClass()) {
            return false;
        } else {
            Movie otherMovie = (Movie) otherObject;
            return (rating.equals(otherMovie.rating) && idNumber == otherMovie.idNumber && movieTitle.equals(otherMovie.movieTitle));
        }
    }

    public String toString() {
        return ("\nMPAA rating: " + rating + "\nTitle: " + movieTitle + "\nID of movie: " + idNumber);
    }
}
