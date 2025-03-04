package Arrays_Practice;

public class ReversingArray {
    public static void main(String[] args){
        int[] original = {1,2, 3, 4, 5};
        int[] reversed = new int[original.length];
        for(int i = 0; i < original.length; i++){
            reversed[i] = original[original.length - 1 - i];
        }

        for(int i = 0; i < reversed.length; i++){
            System.out.println(reversed[i]);
        }

        System.out.println("");

        for(int i = 0; i < original.length/2; i++){
            int temp = original[i];
            original[i] = original[original.length -1 -i];
            original[original.length -1 -i] = temp;
        }
        System.out.println("");
        for(int i = 0; i < original.length; i++){
            System.out.println(original[i]);
        }

    }
    
}
