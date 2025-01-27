package STRING;
import java.util.*;
public class PalindromString {
    public static boolean chechPalindrom(String str){
        for (int i = 0; i < str.length()/2; i++) {
            if(str.charAt(i) != str.charAt(str.length() - i - 1)){
                System.out.println("The String is not palindrome");
                return false;
            }
            // else{
            //     return false;
            // }
        }
        System.out.println("The given string is palindrome");
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palindrom = sc.nextLine();
        chechPalindrom(palindrom);
    }
}
