import java.util.*;
public class Armstrong{
    public static double armstrong(int a){
        int count = 0;
        int original = a;
        while(original != 0){
            original /= 10;
            count++;
        }
        int digit = 0;
        double number = 0;
        for(int i = 0; i <= count; i++){
            digit = a % 10;
            number += Math.pow(digit, count);
            a /= 10;
        }

        return number;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        double result = armstrong(a);
        if (result == a) {
            System.out.println(a + " is an Armstrong number.");
        } else {
            System.out.println(a + " is not an Armstrong number.");
        }
        System.out.print(armstrong(a));
    }
}