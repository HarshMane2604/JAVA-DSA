import java.util.*;
public class Function{
    //Function Which we write in class are the methods of that class
    public static void printHelloWorld(){
        System.out.println("Hello World");
    }
    //Multiple functions can be declared in single class
    public static int calculateSum(int a, int b){// parameterized function
        int sum = a + b;
        return sum;
    }
    //In almost all the functions the java uses allways CALL BY VALUE
    //In call by value orginal value is not passed instead copy of that value is passed
    
    //Methods which we use in programming which all ready defined in java are know as inbuilt function
    //Methods which we create like product or factorial are called user defined function

    //PRODUCT OF A AND B
    public static int product(int a, int b){
        int prod = a * b;
        return prod;
    }

    // FACTORIAL OF TWO NUMBERS
    public static int factorial(int n){
        int fact = 1;
        for(int i = 1; i<=n ; i++){
            fact = fact * i;
        }
        return fact;
    } 

    //BINOMIAL QOEFFICIENT
    public static int biCoeff(int n, int r){
        int rFact = factorial(r);
        int cFact = factorial(n - r);
        int result = nFact/(rFact * cFact);
        return result;
    };

    //FUNCTION OVERLOADING 
    //Multiple functions with same name but different parameters and different data types in paramenter
    // and depends on parameter not on return type

    //Function to calcluate sum of 2 number
    public static int sum(int a, int b){
        return a + b;
    }
    //function to calculte the sum of three numbers
    public static int sum(int a, int b ,int c){
        return a + b + c;
    }
    //function to calculte the sum of two numbers
    public static float sum(float a, float b){
        return a + b ;
    }

    // Number is prime or not
    // public static boolean isPrime(int n){
    //     // Corner cases
    //     if(n == 2){
    //         return true
    //     }
    //             isPrime = false;
    //             break;
    //         }
    //     }
    //     return isPrime;
    // } 

    // Optimized way of checking the prime number
    public static boolean isPrime(int n){
        if (n <= 1) {  // Prime numbers are greater than 1
            return false;
        }
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

    // Prime number in range
    public static void primeRange(int n){
        for(int i = 0; i <= n; i++){
            if(isPrime(i)){
                System.out.println(i);
            }
        }
    }
    
    //BINARY TO DECIMAL
    public static void BinaryToDecimal(int biNum){
        int myNum = biNum;
        int dec = 0;
        int pow = 0;
        while(biNum > 0){
            int lastDigit = biNum % 10;
            dec = dec + (lastDigit * (int)Math.pow(2, pow));
            pow++;
            biNum = biNum/10; 
        }
        System.out.println("Decimal number of " + myNum +" = " + dec);
    } 

    //Decimal To Binary
    public static void DecimalToBinary(int n){
        int myNum = n;
        int pow = 0;
        int Bin = 0;
        while(n > 0){
            int rem = n % 2;
            Bin = Bin + (rem * (int)Math.pow(10, pow));
            pow++;
            n = n/2;
        }
        System.out.println("Binary of "+ myNum + " = "+ Bin);
    }

    public static void main(String args[]){
        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int sum =  calculateSum(a, b);// value passed is arguments
        // System.out.println("Sum is: " + sum);
        
        //PRODUCT OF A AND B
        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // System.out.println("Product of a & b is: " + product(a, b));

        //FACTORIAL OF TWO NUMBERS 
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int r = sc.nextInt();
        // int res = biCoeff(n,r);
        //System.out.println("The Binomial Coefficient of given input is " + res + "");
        // System.out.println(sum(3, 5));
        // System.out.println(sum(3.7f, 5.3f));

        // Checking the number is prime or not
        // System.out.println(isPrime(5));
        // primeRange(100);

        // Binary to Decimal
        //BinaryToDecimal(111);

        // Decimal to Binary
        DecimalToBinary(12); 

    }
} 