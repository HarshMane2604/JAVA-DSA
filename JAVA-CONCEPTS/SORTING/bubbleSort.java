public class bubbleSort{
    public static void bubbleSort(int arr[]){
        for (int i = 0; i < (arr.length - 1); i++){
            for(int j = 0; j < (arr.length- i); j++){
                if(arr[j] > arr[j+1]){
                    int a;
                    a = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = a;
                }
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
        bubbleSort(arr);
        printArr(arr);
    }
}