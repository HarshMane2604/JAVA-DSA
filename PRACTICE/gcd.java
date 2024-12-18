public class gcd{
    public static int[] lcmAndGcd(int a, int b) {
        if(a == 0 || b == 0){
            return new int[]{0, 0};
        }
        int gcd = findGcd(a, b);
        int lcm = (a / gcd) * b;
        return new int[]{lcm, gcd};
    }
    public static int findGcd(int a, int b){
            for(int i = Math.min(a, b); i > 1; i--){
                if(a % i == 0 && b % i == 0){
                    return i;
                }
            }
            return 1;
    }
    public static void main(String[] args){
        gcd obj = new gcd();
        findGcd(5, 10);
        int[] ans = obj.lcmAndGcd(5, 10);
        System.out.println(ans[0] + " " + ans[1]);
        System.out.println("~");


    }
}