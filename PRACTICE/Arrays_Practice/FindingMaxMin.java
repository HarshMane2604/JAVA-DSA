package Arrays_Practice;

public class FindingMaxMin {
    public static void main(String[] args) {
        int[] values = {23, 17, 45, 9, 31, 42, 8, 25};
        int max = values[0];
        int min = values[0];
        for(int i = 1; i < values.length; i++){
            if(values[i] > max){
                max = values[i];
            }
            if(values[i] < min){
                min = values[i];
            }
        }
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
}
