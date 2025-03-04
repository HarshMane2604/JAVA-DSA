public class jump {
    public static int minJumps(int[] arr) {
        int n = arr.length;
        
        // If the array has only one element, no jumps are needed
        if (n == 1) return 0;
        
        // If the first element is 0, we cannot move
        if (arr[0] == 0) return -1;

        int maxReach = arr[0];  // Maximum index we can reach
        int steps = arr[0];     // Steps we can take before needing a jump
        int jumps = 1;          // Minimum jumps required

        for (int i = 1; i < n; i++) {
            // If we have reached the last index, return the number of jumps
            if (i == n - 1) return jumps;

            maxReach = Math.max(maxReach, i + arr[i]); // Update maxReach
            steps--;  // Use one step to move

            if (steps == 0) {  // If no more steps left
                jumps++;  // We need to jump
                
                // If we can't move further, return -1
                if (i >= maxReach) return -1;

                // Reset steps to move further
                steps = maxReach - i;
            }
        }
        return -1;  // If we never reach the last index
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
        System.out.println(minJumps(arr1));  // Output: 3

        int[] arr2 = {1, 4, 3, 2, 6, 7};
        System.out.println(minJumps(arr2));  // Output: 2

        int[] arr3 = {0, 10, 20};
        System.out.println(minJumps(arr3));  // Output: -1
    }
    
}
