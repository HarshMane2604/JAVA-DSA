import java.util.*;
public class RotationOfString{
    public static boolean rotation(String str1, String str2){
        if(str1.length() == str2.length()){
            for(int i = 0; i < str1.length(); i++){
                if(str1.equals(str2)){
                    return true;
                }
                // right rotation
                char ch = str1.charAt(str1.length() -1);
                str1 = ch + str1.substring(0, str1.length()-1);
            }
        }
        return false;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        System.out.print(rotation(str1, str2));        
    }
}

