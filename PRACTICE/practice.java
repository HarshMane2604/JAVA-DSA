
// QUESTION OF GCD

// import java.util.*;
// public class practice {
//     public static int Division(int a, int b){
//         if(a == 0 || b == 0){
//             return 0;
//         }else{
//             while (b != 0) {
//                 int temp = b;
//                 b = a % b;
//                 a = temp;
//             }
//         }
//         return a;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         System.out.println(Division(a, b));

//     }
// }

// QUESTION TO CONVERT to CAMELCASE
import java.util.*;

import javax.swing.plaf.synth.SynthStyle;

public class practice {
    public static String camelCase(String str) {
        StringBuilder sb = new StringBuilder("");
        boolean capital = false;
        for (char ch : str.toCharArray()) {
            if (Character.isLetter(ch)) {
                if (str.length() == 0) {
                    sb.append(Character.toLowerCase(ch));
                } else if (capital) {
                    sb.append(Character.toUpperCase(ch));
                } else {
                    sb.append(Character.toLowerCase(ch));
                }
                capital = false;
            }else{
                capital = true;
            }
            
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(camelCase(str));
    }
}