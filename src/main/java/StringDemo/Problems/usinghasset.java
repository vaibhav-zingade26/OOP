package StringDemo.Problems;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Phaser;

public class usinghasset {
    public static void main(String[] args) {
        String s ="VaibhavZingade";
        String sb =s.toLowerCase();
        char[] a =sb.toCharArray();
        HashMap<Character,Integer> hs = new HashMap<>();
        for(char c:a){
            if(hs.containsKey(c)){
                hs.put(c,hs.get(c)+1);
            }else{
                hs.put(c,1);
            }
        }
       // hs.forEach((key,value)-> System.out.println(key+" "+value));
        System.out.println(hs);
    }



}
