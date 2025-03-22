import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

// Class name should be "Source",
// otherwise solution won't be accepted
public class OddEven {
	public static String revesedString(String str){
		StringBuilder sb = new StringBuilder("");
		for(int i = str.length(); i >= 0; i--){
			sb.append(str.charAt(i));
		}
		return sb.toString();
	}
	public static void main(String args[] ) throws Exception {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT */
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.print(revesedString(str));
	}
}