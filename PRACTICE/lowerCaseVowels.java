import java.util.*;
public class lowerCaseVowels {
    public static int countLowerCase(String str){
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char vowels = str.charAt(i);
            if(vowels == 'a' || vowels == 'e' || vowels == 'i' ||vowels == 'o' || vowels == 'u' ){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        System.out.println(countLowerCase(sentence));    

    }
}
