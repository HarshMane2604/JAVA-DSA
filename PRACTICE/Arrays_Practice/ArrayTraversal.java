package Arrays_Practice;

public class ArrayTraversal {
    public static void main(String[] args) {
        int[] numbers = { 10, 20, 30, 40, 50 };
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        System.out.println("");
        
        //Advanced for loop (for-each loop)
        for(int num : numbers){
            System.out.println(num);
        }
    }
}
