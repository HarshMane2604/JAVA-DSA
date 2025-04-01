import java.util.Arrays;

public class CommonPrefix{

    public static String longestCommonPrefix(String[] str){
        Arrays.sort(str);
        String first = str[0];
        String last = str[str.length - 1];
        
        int minLength = Math.min(first.length(), last.length() - 1);

        int i = 0;

        while (i < minLength && first.charAt(i) == last.charAt(i)) {
            i++;
        }

        return first.substring(0, i);
    }
    public static void main(String[] args){
        String[] str = { "geeksforgeeks", "geeks", 
        "geek", "geezer" };
        System.out.println(longestCommonPrefix(str));
    }
}