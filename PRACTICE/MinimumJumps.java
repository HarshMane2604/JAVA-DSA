// Given an array arr[] of non-negative integers. Each array element represents the maximum 
// length of the jumps that can be made forward from that element. This means if arr[i] = x, then 
// we can jump any distance y such that y ≤ x. Find the minimum number of jumps to reach the end of
// the array starting from the first element. If an element is 0,
// then you cannot move through that element.

// Note:  Return -1 if you can't reach the end of the array.

// Examples : 

// Input: arr[] = [1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9]
// Output: 3 
// Explanation: First jump from 1st element to 2nd element with value 3. From here we jump to 5th element with value 9, and from here we will jump to the last. 
// Input: arr = [1, 4, 3, 2, 6, 7]
// Output: 2 
// Explanation: First we jump from the 1st to 2nd element and then jump to the last element.
// Input: arr = [0, 10, 20]
// Output: -1
// Explanation: We cannot go anywhere from the 1st element.
public class MinimumJumps {
    public static int minJumps(int[] arr) {
        if (arr.length <= 1) {
            return 0; // Already at the end
        }
        if (arr[0] == 0) {
            return -1; // Cannot move anywhere
        }

        int jumps = 0; // Number of jumps
        int current_end = 0; // Farthest position reachable with the current jumps
        int farthest = 0; // Farthest position reachable overall

        for (int i = 0; i < arr.length; i++) {
            farthest = Math.max(farthest, i + arr[i]);

            // If the current_end reaches or exceeds the last index, return jumps
            if (i == current_end) {
                jumps++;
                current_end = farthest;

                if (current_end >= arr.length - 1) {
                    return jumps;
                }
            }

            // If the farthest point is not advancing, return -1
            if (farthest <= i) {
                return -1;
            }
        }

        return -1; // If the loop ends without reaching the last index
    }

    public static void main(String[] args) {
        MinimumJumps sol = new MinimumJumps();

        int[] arr1 = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
        System.out.println(sol.minJumps(arr1)); // Output: 3

        int[] arr2 = {1, 4, 3, 2, 6, 7};
        System.out.println(sol.minJumps(arr2)); // Output: 2

        int[] arr3 = {0, 10, 20};
        System.out.println(sol.minJumps(arr3)); // Output: -1

        int[] arr4 = {1};
        System.out.println(sol.minJumps(arr4)); // Output: 0
    }
}
