public class insertionSort{
    public static void insertionSort(int arr[]){
        for(int i = 1; i < arr.length - 1; i++){
            int curr = i;
            int prev = i - 1;
            if(arr[curr] < arr[prev]){
                int temp = arr[curr];
                arr[curr] = arr[prev];
                arr[prev] = temp;
            }
        }
    }
    public static void printArr(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args){
        int arr[] = {5, 4, 1, 3, 2};
        insertionSort(arr);
        printArr(arr);
    }
}