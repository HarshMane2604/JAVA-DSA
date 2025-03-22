package STRING;
import java.util.*;
public class ShortestDistance {
    public static double distance(String str){
        int W = 0, E = 0, S = 0, N = 0;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == 'W'){
                W++;
            }else if(str.charAt(i) == 'E'){
                E++;
            }else if(str.charAt(i) == 'S'){
                S++;
            }else if(str.charAt(i) == 'N'){
                N++;
            }
        }
        int x = E - W;
        int y = N - S;
        double distance = Math.pow(x, 2) + Math.pow(y, 2);
         

        return Math.sqrt(distance);
    }
    public static void main(String[] args) {
        String str = "ESWWSWNWSSS";
        System.out.println(distance(str));

    }
}
