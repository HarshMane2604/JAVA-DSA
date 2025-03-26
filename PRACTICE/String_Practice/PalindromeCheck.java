import java.util.*;
public class PalindromeCheck {
    public static boolean isPalindrome(String str){
        for(int i = 0; i < str.length()/2; i++){
            if(str.charAt(i) == str.charAt(str.length() - i - 1)){
                return true;
            }
        } 
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = sc.nextLine();
        System.out.println("Palindrome is " + isPalindrome(str));
    }
}
