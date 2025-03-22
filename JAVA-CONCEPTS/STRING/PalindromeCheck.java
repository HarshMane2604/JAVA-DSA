package STRING;
import java.util.*;
public class PalindromeCheck {
    public static boolean pallindrome(String str){
        for(int i = 0; i < str.length()/2; i++){
            if(str.charAt(i) != str.charAt(str.length() - 1 -i)){
               System.out.print("String is not palindrome");
                return false;
            }
        }
        System.out.print("String is palindrome");
        return true;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        pallindrome(word);
    }
}
