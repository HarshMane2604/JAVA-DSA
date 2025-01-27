package STRING;
// import java.util.*;
public class findShortestPath {
    public static float shortestDist(String path){
        int x = 0 , y = 0;
        for (int i = 0; i < path.length(); i++) {
            char dir = path.charAt(i);
            if(dir == 'S'){
                y--;
            }else if(dir == 'N'){
                y++;
            }else if(dir == 'W'){
                x--;
            }
            else{
                x++;
            }
        }
        int x2 = x * x;
        System.out.println(x2);
        int y2 = x * x;
        System.out.println(y2);
        return (float)Math.sqrt(x2 + y2);
    }
    public static void main(String[] args) {
        String path = "EWNS";
        System.out.println(shortestDist(path));

    }
}
