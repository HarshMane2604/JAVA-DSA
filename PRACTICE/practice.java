import java.util.*;
public class practice {
    public static int Division(int a, int b){
        if(a == 0 || b == 0){
            return 0;
        }else{
            while (b != 0) {
                int temp = b;
                b = a % b;
                a = temp;
            }
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(Division(a, b));
        
    }
}
