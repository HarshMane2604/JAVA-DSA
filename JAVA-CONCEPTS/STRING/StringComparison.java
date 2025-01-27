package STRING;

public class StringComparison {
    public static void main(String[] args) {
        String s1 = "Harsh";
        String s2 = "Harsh";
        String s3 = new String("Harsh");
        if (s1 == s2) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }
        // here s1 and s2 haves the same value so s2 points the value of s1 but in back s2 will not have "Harsh"
        if (s1 == s3) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }
        //.equals(obj) returns the bool type if equals return the true
        if (s1.equals(s3)) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }
    }
}
