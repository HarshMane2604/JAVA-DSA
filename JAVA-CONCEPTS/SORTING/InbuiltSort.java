import java.util.*;
// OR
// import java.util.Arrays;
public class InbuiltSort{
    public static void printArr(Integer arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String args[]){
        Integer arr[] = {5, 4, 1, 3, 2};
        // Arrays.sort(arr);
        // OR
        Arrays.sort(arr, 0, 3); // THIS IS FOR ASCENDING ORDER 
        
        // Arrays.sort(arr, Collections.reverseOrder());// THIS IS FOR DESCENDING ORDER
        Arrays.sort(arr, 0, 4, Collections.reverseOrder());
        printArr(arr);
    }
}