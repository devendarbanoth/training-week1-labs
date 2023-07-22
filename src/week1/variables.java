package week1;

public class variables {

    //Instance Variables
    private double width;
    private double height;
    private double depth;


    //Static Variable
    private static int boxid;

    public double volume() {
        //private variable/local variable
        double stemp;
        stemp = width * height * depth;
        return stemp;

    }
}