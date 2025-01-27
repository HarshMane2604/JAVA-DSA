package STRING;

public class printLargestString {
    public static void main(String[] args) {
        // The compareto follows the lexicographic order
        String fruits[] = {"apple", "mango", "banana"};
        String largest = fruits[0];
        for (int i = 0; i < fruits.length; i++) {
            if(largest.compareTo(fruits[i]) < 0){
                    largest = fruits[i];
            };
        }
        System.out.println(largest);
    }
}
