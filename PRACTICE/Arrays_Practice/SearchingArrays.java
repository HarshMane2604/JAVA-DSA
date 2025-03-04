package Arrays_Practice;
public class SearchingArrays{
    public static int linearSearch(int[] arr, int key){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == key){
                return i+1;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] arr, int key){
        int left = 0;
        int right = arr.length - 1;
        while(left <= right){
            int mid = (left +  right) / 2 ;
            if(arr[mid] == key){
                return mid+1;
            }else if(arr[mid] < key){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String args[]){
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        //int key = 10;
        int key = 2;
        //System.out.println(linearSearch(arr, key));
        System.out.println(binarySearch(arr, key));
    }
}