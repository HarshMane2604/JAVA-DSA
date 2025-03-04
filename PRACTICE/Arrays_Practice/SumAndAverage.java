package Arrays_Practice;

public class SumAndAverage {
    public static void main(String args[]) {
        int[] Scores = { 85, 92, 78, 90, 88 };
        int sum = 0;
        for (int score : Scores) {
            sum += score;
        }
        double average = (double) sum / Scores.length;
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
    }
}
