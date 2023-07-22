package Lab1;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        System.out.println("\nEnter CTRL+D to exit the program");
        System.out.println("Input the string : ");
        do {
            String str = sc.nextLine();
            str = str.toLowerCase();
            CheckStringType checkStringType = new CheckStringType(str);
            System.out.println(checkStringType.checkString());
        }while(Boolean.TRUE);

    }
}

class CheckStringType{
    private String str;

    public CheckStringType(String str) {
        this.str = str;
    }

    public Boolean checkString(){
        int oldCharacterValue = 'a';
        int curCharacterValue = 'z';
        for(char ch: str.toCharArray()) {
            if(ch == ' '){
                continue;
            }
            curCharacterValue = ch;
            if(curCharacterValue < oldCharacterValue){
                return Boolean.FALSE;
            }
            oldCharacterValue = curCharacterValue;
        }
        return Boolean.TRUE;
    }
}