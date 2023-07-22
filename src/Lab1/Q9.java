package Lab1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Q9 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter the string input : ");
        String str = sc.nextLine();
        StringPlayer stringPlayer = new StringPlayer(str);

        System.out.println("\nChoose an option from below \n1.Add self \n2.Replace odd position chars to # \n" +
                "3.Remove duplicate characters\n4.Convert odd position chars to UpperCase\n\nOption : ");

        Integer n = sc.nextInt();

        do {
            switch (n) {
                case 1:
                    stringPlayer.addSelf();
                    break;
                case 2:
                    stringPlayer.replaceOddPos();
                    break;
                case 3:
                    stringPlayer.removeDuplicateChars();
                    break;
                case 4:
                    stringPlayer.oddCharsToUppercase();
                    break;
                default:
                    System.out.println("Invalid Input");
            }
            n = sc.nextInt();
        }while(n>0 && n<5);

    }

}

 class StringPlayer {
    private String str;

     public StringPlayer(String str) {
         this.str = str;
     }

     public void addSelf(){
        System.out.println(str + str);
    }
    public void replaceOddPos(){
        long n = str.length();
        char[] charArray = str.toCharArray();
        for(int i = 0; i < charArray.length; i++) {
            charArray[i] = '#';
            i++;
        }
        str = new String(charArray);
        System.out.println(str);
    }
    public void removeDuplicateChars(){
        Set<Character> uniqueChars = new HashSet<>();
        StringBuilder newString = new StringBuilder();

        for (char ch : str.toCharArray()) {
            if (!uniqueChars.contains(ch)) {
                uniqueChars.add(ch);
                newString.append(ch);
            }
        }
        str = newString.toString();
        System.out.println(str);
    }
    public void oddCharsToUppercase(){
        long n = str.length();
        char[] charArray = str.toCharArray();
        for(int i = 0; i < charArray.length; i++) {
            char currChar = charArray[i];
            charArray[i] = Character.toUpperCase(currChar);
            i++;
        }
        str = new String(charArray);
        System.out.println(str);
    }
}
