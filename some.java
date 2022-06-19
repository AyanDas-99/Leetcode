import java.util.HashMap;
import java.util.Map;

public class some {
     public static int romanToInt(String s) {
        Map<String, Integer> map = new HashMap<>();
        map.put("I", 1);
        map.put("V",5);
        map.put("X",10);
        map.put("L",50);
        map.put("C",100);
        map.put("D",500);
        map.put("M",1000);
        
        int result=map.get(s.charAt(0));
        for(int i=1;i<s.length();i++){
            if(map.get(s.charAt(i)) > map.get(s.charAt(i-1))){
                result += map.get(s.charAt(i)) - (2*map.get(s.charAt(i-1)));
            }
            else{
                result += map.get(s.charAt(i));
            }
        }
        return result;
    }
    public static void main(String[] args) {
        // Map<String, Integer> map = new HashMap<>();
        // map.put("I", 1);
        // map.put("V",5);
        // map.put("X",10);
        // map.put("L",50);
        // map.put("C",100);
        // map.put("D",500);
        // map.put("M",1000);
        
        // System.out.println(map.get("I"));
        // String s = "XVII";
        // System.out.println(s.length());
        String a = "III";
        int n = romanToInt(a);
        System.out.println(n);
    }
}
