public class recursion1toN {
    static int cnt = 0;
        public static void print1toN(int N){
            
             // Base Condition.
             if(cnt == N ) return;
             System.out.println(cnt);
    
             // Count incremented.
             cnt = cnt+1;
             print1toN(N);
    
        }
        public static void main(String[] args) {
            print1toN(5);
        }
}