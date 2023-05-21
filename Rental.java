/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Zana Kapetanovic
 */
public class Rental {
    Movie rentedMovie;
    int customerID;
    int daysLate;
    
    public Rental(Movie rM, int cId, int dL)
    {
        setRentedMovie(rM);
        setCustomerID(cId);
        setDaysLate(dL);
    }
    public void setRentedMovie(Movie rM)
    {
        this.rentedMovie = rM.clone();
    }
    public void setCustomerID(int cId)
    {
        this.customerID = cId;
    }
    public void setDaysLate(int dL)
    {
        this.daysLate = dL;
    }
    public double calcLateFeesRental()
    {
        return this.rentedMovie.calcLateFees(this.daysLate);
    }
    @Override
    public String toString()
    {
        return ("\nRented movie: " + this.rentedMovie.movieTitle + "\nID of customer: " + customerID );
    }
}
