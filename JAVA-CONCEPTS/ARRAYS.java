//List of element of the same type placed in contiguoud memory location
//Operations in array
// CREATE
// INPUT
// OUTPUT
// UPDATE

// Syntax 
// dataType arrayName[] = new dataType[size];
// int marks[] = new int[150]; // by default 0 is stored;
// int number[] = {1,2,3,3};
// int fruits[] = {"Apple", "MAngo", "Watermelon"};

// FOR INPUT

// int marks[] = new int[100];
//         Scanner sc = new Scanner(System.in);
//         marks[0] = sc.nextInt();
//         marks[1] = sc.nextInt();
//         marks[2] = sc.nextInt();
//         System.out.println("Phy : " + marks[0]);
//         System.out.println("Chem : " + marks[1]);
//         System.out.println("Maths : " + marks[2]);

// ARITHMETIC OPERATION
// int percentage = (marks[0] + marks[1] + marks[2])/3;
//         System.out.println("Percentage = " + percentage + "%");

// LENGTH OF ARRAY
// System.out.println("length of array is: "+ marks.length);

//LINEAR SEARCH

import java.util.*;
// public class ARRAYS{
//     public static int linearSearch(int number[], int key){
//         for(int i = 0; i < number.length; i++){
//             if(number[i] == key){
//                 return i;
//             }
//         }
//         return -1;
//     }
//     public static void main(String[] args){
//         int number[] = {2, 23, 25, 65, 99, 10, 12};
//         String menu[] = {"Dosa", "Utappa", "idli"}; 
//         int key = 10; 
//         int index = linearSearch(number, key);
//         if(index == -1){
//             System.out.println("Not Found");
//         }else{
//             System.out.println("Key is at index: " + index);
//         }

//     }

// }

// //LARGEST NUMBER

// // -infinity = Integer.MIN_VALUE
// // +infinity = Integer.MAX_VALUE

// public class ARRAYS{
//     public static int getLargest(int numbers[]){
//         int largest = Integer.MIN_VALUE;
//         int smallest = Integer.MAX_VALUE;
        
//         for(int i = 0; i < numbers.length; i++){
//             if(numbers[i] > largest){
//                 largest = numbers[i];
//             }
//             if(smallest > numbers[i]){
//                 smallest = numbers[i];
//             }
//         }
//         System.out.println("Smallest value is " + smallest);
//         return largest; 
//     }
//     public static void main(String args[]){
//         int numbers[] = {1, 2, 5, 6, 3};
//         System.out.println("The largest number is "+ getLargest(numbers));

//     }
// } 

// // BINARY SEARCH
// // Sorting is necessary weather it is ascending or decending  
// public class ARRAYS{
//     public static int binarySearch(int numbers[], int key){
//         int start = 0;
//         int end = numbers.length - 1;
//         while(start <= end){
//             int mid = (start + end)/2;
//             if(numbers[mid] == key){
//                 return mid;
//             }
//             if(numbers[mid] < key){
//                 start = mid + 1; 
//             }else{
//                 end = mid - 1; 
//             }
//         }
//         return - 1;
//     }
//     public static void main(String[] args){
//         int numbers[] = {1, 2, 3, 5, 6};
//         int key = 25;
//         System.out.println("Index for the key is : " +binarySearch(numbers, key));
//     }
// }

// REVERSE IN ARRAY
// public class ARRAYS{
//     public static void reverse(int numbers[]){
//         int first = 0, last = numbers.length - 1;
//         while(first < last){
//             int temp = numbers[last];
//             numbers[last] = numbers[first];
//             numbers[first] = temp;
//             first++;
//             last--;
//         }
//     }
    
//     public static void main(String args[]){
//         int numbers[] = {2, 4, 6, 1, 10};
//         reverse(numbers);
//         for(int i = 0; i < numbers.length; i++){
//             System.out.print(numbers[i] + " ");
//         }
//     }
// }

// PRINT PAIRS OF ARRAYS

// public class ARRAYS{
//     public static void printPairs(int numbers[]){
//         for(int i = 0; i < numbers.length; i++){
//             int current = numbers[i];
//             for(int j = i+1; j < numbers.length; j++){
//                 System.out.print("(" + current + "," + numbers[j] + ") ");
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String[] args){
//         int numbers[] = {2,4,6,8,10};
//         printPairs(numbers);
//     }
// }


// PRINT SUBARRAYS/MAX SUBARRAY SUM (Continous part of array)
// BRUTE FORCE APPROACH
// public class ARRAYS{
//     public static void MaxSumSubArray(int arr[]){
//         int currSum = 0;
//         int maxSum = Integer.MIN_VALUE;
//         for(int i = 0; i < arr.length; i++){
//             for(int j = i; j < arr.length; j++){
//                 currSum = 0;
//                 for(int k = i; k <= j; k++){
//                     currSum += arr[k];
//                 }
//                 System.out.println(currSum);
//                 if(maxSum < currSum){
//                      maxSum = currSum;
//                 }
                
//             }
            
//         }
//         System.out.println("Max sum = " + maxSum);
//     }
//     public static void main(String[] args){
//         int arr[] = {2, 4, 6, 8, 10};
//         MaxSumSubArray(arr); 
//     }
// }

// MAX SUBARRAY SUM 
// PREFIX APPROACH

// public class ARRAYS{ 
//     public static void MaxSumSubArray(int arr[]){
//            int currSum = 0;
//            int maxSum = Integer.MIN_VALUE;
//            int prefix[] = new int[arr.length];
//            prefix[0] = arr[0];
//            for(int i = 1; i < prefix.length; i++){
//             prefix[i] = prefix[i - 1] + arr[i];
//            }

//            for(int i = 0; i < arr.length; i++){
//             for(int j = i; j < arr.length; j++){
//                 currSum = i == 0 ? prefix[j] : prefix[j] - prefix[i - 1];
//             }
//             if(maxSum < currSum){
//                 maxSum = currSum;
//             }
//            }
//            System.out.println("Max sum = " + maxSum);
//     }
//     public static void main(String[] args){
//         int arr[] = {1, -2, 6, -1, 3};
//         MaxSumSubArray(arr);
//     }
// }

// MAX SUBARRAY SUM 
// KADANES APPROACH

// public class ARRAYS{ 
//     public static void kadanes(int arr[]){
//         int maxSum = Integer.MIN_VALUE;
//         int currSum = 0;
//         for(int i = 0; i < arr.length; i++){
//             currSum += arr[i];
//             if(currSum < 0){
//                 currSum = 0;
//             }
//             maxSum = Math.max(currSum, maxSum);
//         }
//         System.out.println("Our max subarray sum is : " + maxSum);
//     }
//     public static void main(String[] args){
//         int arr[] = {-2, -3, 4, -1, -2, 1, 5, -3};
//         kadanes(arr);
//     }
// }

// TRAPPING WATER
// BUY AND SELL STOCKS
// public class ARRAYS{
//     public static int BuyAndSellStocks(int price[]){
//         int buyPrice = Integer.MAX_VALUE;
//         int maxProfit = 0;
//         for(int i = 0; i < price.length; i++){
//             if(buyPrice < price[i]){
//                 int profit = price[i] - buyPrice;
//                 maxProfit = Math.max(maxProfit, profit);
//             }else{
//                 buyPrice = price[i];
//             }
//         } 
//         return maxProfit;
//     }
//     public static void main(String[] arg){
//         int price[] = {7, 1, 5, 3, 6, 4};
//         System.out.println(BuyAndSellStocks(price));
//     }   
// }














