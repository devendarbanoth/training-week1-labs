package week1;


class Calculate{
    private int length;
    private int height;
    private int breadth;

    public double volume(int l, int h, int b){
        return l*h*b;
    }
}

public class TC_variables {
    public static void main(String[] args){

        int l=10, b=12, h=6;
        Calculate calculate = new Calculate();
        System.out.println(calculate.volume(l,b,h));

    }
}
