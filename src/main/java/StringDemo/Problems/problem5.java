package StringDemo.Problems;

import java.util.HashMap;

public class problem5 {
    public static void main(String[] args) {
        String s="VaibhavZingade";
        char[] a = s.toCharArray();
        HashMap<Character,Integer> hs = new HashMap<>();
        for(char c:a){
            if(hs.containsKey(c)){
                hs.put(c,hs.get(c)+1);
            }else {
                hs.put(c,1);
            }
        }
        System.out.println(hs);
    }

}
