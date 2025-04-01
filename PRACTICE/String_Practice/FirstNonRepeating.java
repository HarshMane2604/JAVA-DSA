import java.util.*;
public class FirstNonRepeating{
    public static char nonRepeating(String str){
        for(int i = 0; i < str.length(); i++){
            boolean found = false;

            for(int j = 0; j < str.length(); j++){
                if(i != j && str.charAt(i) == str.charAt(j)){
                    found = true;
                    break;
                }
            }
            if(!found){
                return str.charAt(i);
            }
        }
        return '$';
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter the word: ");
        String str = sc.nextLine();
        System.out.println(nonRepeating(str));;
        sc.close();
    }
}