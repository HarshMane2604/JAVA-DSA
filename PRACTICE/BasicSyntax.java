import java.util.*;
// QUESTION 1
// public class Basic{
//     public static void main(String[] args){
//         System.out.println("Hello World"); 
//     }
// }

// // QUESTION 2

// public class Basic{
//     public static int sum(int a, int b){
//         return a + b;
//     }
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         System.out.println("The Sum of two numbers is "+ sum(a,b));
//     }  
// }

// QUESTION 3

// public class Basic{
//     public static int greatest(int a, int b, int c){
//         if(a > b && a > c){
//             return a;
//         }
//         if(b > c){
//             return b;
//         }
//         else{
//             return c;
//         }
//     }
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int c = sc.nextInt();
//         System.out.println("Greatest number is " + greatest(a, b, c));

//     }
// }

// 2. Control Statements
//  QUESTION 1
// public class Basic{
//     public static void evenOrOdd(int n){
//         if(n % 2 == 0){
//             System.out.println("The Number is even");
//         }
//         else{
//             System.out.println("The Number is Odd");
//         }
//     }

//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         evenOrOdd(n);
//     }
// }

// // QUESTION 2
// public class Basic{
//     public static void leapYear(int n){
//         if(n % 4 == 0){
//             if(n % 100 == 0){
//                 if(n % 400 == 0){
//                     System.out.println("The given year "+ n + " is leap year");
//                 }
//                 else{
//                     System.out.println("The given year "+ n + " is not a leap year");
//                 }
//             }else{
//                 System.out.println("The given year "+ n + " is leap year");
//             }
//         }else{
//             System.out.println("The given year "+ n + " is not a leap year");
//        }
//     }
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the leap year");
//         int n = sc.nextInt();
//         leapYear(n);
//        }
// }

// QUESTION 3
// public class Basic{
//     public static void table(int n){
//         for(int i = 0; i <= 10; i++){
//             int mul = n * i;
//             System.out.println(n + " x " +i+ " = "+mul);
//         }
//     }
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the number");
//         int n = sc.nextInt();
//         table(n);
//     }
// }

// QUESTION 4
// public class Basic{
//     public static void fizzBuzz(){
//         for(int i = 1; i <= 100; i++){
//             if(i % 3 == 0 && i % 5 == 0){
//                 System.out.println(i +" FIZZBUZZ");
//             }
//             else if(i % 3 == 0){
//                 System.out.println(i + " FIZZ");
//             }
//             else if(i % 5 == 0){
//                 System.out.println(i + " BUZZ");
//             }else{
//                 System.out.println(i);
//             }
//         }
//     }
//     public static void main(String[] args){
//         fizzBuzz();
//     }
// }

// 3. Loops:
// QUESTION 1
// public class Basic{
//     public static void main(String[] args){
//         int n;
//         int fact = 1;
//         Scanner sc = new Scanner(System.in);
//         n =  sc.nextInt();
//         for(int i = 1; i <= n; i++){
//             fact  = fact * i;
//         }
//         System.out.println(fact);
//     }
// }

// QUESTION 2
// public class Basis{
//     public static void main(String[] args){
//         System.out.print("Enter the term: ");
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int a = 0, b = 1;
//         for(int i = 0; i <= n; i++){
//             int nextInt = a + b;
//             System.out.print(" " + nextInt);
//             a = b;
//             b = nextInt;
//         }
//     }
// }

//QUESTION 3
// public class Basic{
//     public static int reverseNumber(int n){
//         int reversed = 0;
//         for(; n != 0; n/=10){
//             int digit = n % 10;
//             reversed = reversed * 10 + digit;
//         }
//         return reversed;
//     }
//     public static void main(String[] args){
//         System.out.print("Enter the number: ");
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         System.out.println(reverseNumber(n));
//     }
// }