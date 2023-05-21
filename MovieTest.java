
import java.util.Arrays;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Zana Kapetanovic
 */
public class MovieTest {
     public static double lateFeesOwed(Rental rentals[])
            {
                int sum = 0;
            for(int i = 0; i< rentals.length; i++)
            {
                sum +=rentals[i].calcLateFeesRental();
            }
            return sum;
            }
    public static void main(String[] args)
    {
        Action a= new Action(544, "The Batman", "G");
        Comedy c = new Comedy(870, "Spy", "PG-13");
        Drama d = new Drama(254, "The Godfather", "R");
        Rental rentals[] = new Rental[3];
        rentals[0] = new Rental(c, 2334, 8);
        rentals[1] = new Rental(a, 7772, 6);
        rentals[2] = new Rental(d, 1292, 4);
        

        System.out.println(a.toString());
        System.out.println("Late fee for movie: " + a.calcLateFees(7) + "$");
        System.out.println(c.toString());
        System.out.println("Late fee for movie: " + c.calcLateFees(5) + "$");
        System.out.println(d.toString());
        System.out.println("Late fee for movie: " + d.calcLateFees(4) + "$");
        System.out.println("-----------------------");
        System.out.println("\n" + Arrays.toString(rentals));
        System.out.println("Checking if two movies are equal? " + a.equals(c));
        System.out.println("\nTotal amount of late fees is: " + lateFeesOwed(rentals) + "$");
    }
}
