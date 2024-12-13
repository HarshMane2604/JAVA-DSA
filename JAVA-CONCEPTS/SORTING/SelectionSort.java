public class SelectionSort{
    public static void SelectionSort(int arr[]){
        for(int i = 0; i < arr.length -1; i++){
            int smallest = i;
            for(int j = i + 1; j < arr.length; j++){
                if(arr[smallest] > arr[j]){
                    smallest = j;
                }
            }
            //SWAP
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
    }
    public static void printArr(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args){
        int arr[] = {5, 4, 1, 3, 2};
        SelectionSort(arr);
        printArr(arr);
    }
}