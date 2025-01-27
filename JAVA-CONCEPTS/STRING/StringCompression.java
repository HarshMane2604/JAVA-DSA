package STRING;

public class StringCompression {
    public static String compress(String str){
        if (str == null || str.length() == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder("");
        int count = 1;
        for(int i = 0; i < str.length(); i++){
            if(i < str.length() - 1 && str.charAt(i) == str.charAt(i+1)){
                count++;
            }else{
                sb.append(str.charAt(i));
                if(count > 1){
                    sb.append(count);
                }
                count = 1;
            }

        }
        return sb.toString();
    }   
    public static void main(String[] args) {
        String str = "aaaabbcccdd";
        String compressed = compress(str);
        System.out.println("Compressed String: " + compressed);
    }
}
