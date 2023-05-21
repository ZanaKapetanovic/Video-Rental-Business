/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Zana Kapetanovic
 */
public class Comedy extends Movie {

    public Comedy() {
        super();
    }

    public Comedy(int idN, String t, String r) {
        super(idN, t, r);
    }

    public Comedy(Comedy originalObject) {
        super(originalObject);
    }

    @Override
    public double calcLateFees(int daysLate) {
        return 6 * daysLate;
    }
    @Override
    public Movie clone()
    {
        return new Comedy(this);
    }
}
