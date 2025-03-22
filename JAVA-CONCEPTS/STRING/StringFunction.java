package STRING;

import java.util.*;

public class StringFunction {
    public static void printLetters(String str){
        for(int i = 0; i < str.length(); i++){
            System.out.print(str.charAt(i) + " " );
        }
    }
    public static void main(String[] args) {
        String s1 = "Harsh";
        String s2 = "Harsh";
        String s3 = new String("Harsh");
        //String fullName = firstName + " " + lastName;
        // charAt(index)
        // System.out.println(fullName.charAt(6));
        // printLetters(fullName);

        //String Comparison

        if(s1 == s2){
            System.out.println("Strings are equal");
        }
        else{
            System.out.println("Strings not are equal");
        }

        if(s1 == s3){
            System.out.println("Strings are equal");
        }
        else{
            System.out.println("Strings not are equal");
        }
            // Due to interning
        if(s1.equals(s3)){
            System.out.println("Strings are equal");
        }
        else{
            System.out.println("Strings not are equal");
        } // Whenever we want to compare the strings we use .equals()
    }
}
