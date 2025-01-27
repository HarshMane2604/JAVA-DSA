class solution {
    public void printNos(int n) {
        // Base case: if n is 0, stop recursion
        if (n == 0) {
            return;
        }

        // Recursive call to print numbers from 1 to n-1
        printNos(n - 1);

        // Print the current number after the recursive call
        System.out.print(n + " ");
    }
    public static void main(String[] args) {
        solution obj = new solution();
        obj.printNos(10);
    }
}
