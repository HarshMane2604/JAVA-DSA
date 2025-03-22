package STRING;

import java.util.*;

public class StringFunction {
    public static void printLetters(String str){
        for(int i = 0; i < str.length(); i++){
            System.out.print(str.charAt(i) + " " );
        }
    }
    public static void main(String[] args) {
        String firstName = "Harsh";
        String lastName = "Mane";
        String fullName = firstName + " " + lastName;
        //charAt(index)
        System.out.println(fullName.charAt(6));
        printLetters(fullName);
    }
}
