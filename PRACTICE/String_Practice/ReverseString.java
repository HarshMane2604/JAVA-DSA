import java.util.*;
public class ReverseString{
    public static String reversrStr(String str){
        return new StringBuilder(str).reverse().toString(); 
    }


    // Not optimized way
    // public static String reversrStr(String str){
    //     String reversed = ""; 
    //     for(int i = 0; i < str.length(); i++){
    //         reversed += str.charAt(str.length() - 1 - i);
    //     }
    //     return reversed;
    // }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter the String: ");
        String str = sc.nextLine();
        System.out.println(reversrStr(str));;
    }
}