# Video-Rental-Business

First step in project that will keep track of video rental business is creating a class named Movie. The Movie class should 
track the Motion Picture Association of America (MPAA) rating (e.g., Rated G, PG-13, R), ID Number, and movie title with appropriate accessor and mutator methods. 
Equals() method overrides Object's equals() method, where two movies are equal if their ID number is identical. 
In addition, there are three classes named Action, Comedy, and Drama that are derived from Movie and 
overridden abstract method named calcLateFees() that takes as input the number of days a movie is late and returns the late fee for that movie.
Action movies have a late fee of $8/day, comedies are $6/day, and dramas are $4/day. 

In order to track the status of rented movies there is additional Rental class.
This class has stored a Movie that is rented, an integer representing the ID of the customer that rented the movie, and an integer indicating how many days late the 
movie is. There is also method that calculates the late fees for the rental. 
Main method contains an array of type Rental filled with sample data of all types of movies and a method named lateFeesOwed that 
iterates through the array and returns the total amount of late fees that are outstanding.
