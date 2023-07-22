package Lab1;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] arg){

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        if(a>0){
            System.out.println("The input value is " + a + " and it is Positive");
        } else if (a<0) {
            System.out.println("The input value is " + a + " and it is Negative");
        } else{
            System.out.println("The input value is zero");
        }
    }
}
