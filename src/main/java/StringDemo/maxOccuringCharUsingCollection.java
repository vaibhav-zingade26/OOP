package StringDemo;

import java.util.HashMap;
import java.util.Map;

public class maxOccuringCharUsingCollection {
    public static void main(String[] args) {
        String s ="aabbvvggddffsjjllsiiiiii";
        HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
        char[] c =s.toCharArray();
        for(char ch:c){
            if(hm.containsKey(ch)){
                hm.put(ch,hm.get(ch)+1);
            }else{
                hm.put(ch,1);
            }
        }
        System.out.println(hm.keySet());
        System.out.println(hm.values());
        int max =0;
        char maxValueChar=' ';

        for(Map.Entry <Character,Integer> desrired :hm.entrySet()){
            if(max<desrired.getValue()){
                max = desrired.getValue();
                maxValueChar = desrired.getKey();
            }
        }
        System.out.println("max char found of "+maxValueChar);
    }
}
