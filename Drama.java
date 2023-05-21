/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Zana Kapetanovic
 */
public class Drama extends Movie {

    public Drama() {
        super();
    }

    public Drama(int idN, String t, String r) {
        super(idN, t, r);
    }

    public Drama(Drama originalObject) {
        super(originalObject);
    }

    @Override
    public double calcLateFees(int daysLate) {
        return 4 * daysLate;
    }
   @Override
    public Movie clone() 
    {
        return new Drama(this);
    }
}
