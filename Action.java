/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Zana Kapetanovic
 */
public class Action extends Movie {

    public Action() {
        super();
    }

    public Action(int idN, String t, String r) {
        super(idN, t, r);
    }

    public Action(Movie originalObject) {
        super(originalObject);
    }

    @Override
    public double calcLateFees(int daysLate) {
        return 8 * daysLate;
    }
    @Override
    public Movie clone()
    {
        return new Action(this);
    }
}
