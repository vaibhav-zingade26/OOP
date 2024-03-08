package StringDemo.StringJava;

import java.util.HashMap;
import java.util.HashSet;

public class repeatingChar {
    public static void main(String[] args) {
        String s1 = "abcdvfg";
        for(int i=0;i<s1.length();i++){
            for(int j=i+1;j<s1.length();j++){
                if(s1.charAt(i)==s1.charAt(j)){
                    System.out.println(s1.charAt(i));
                }
            }
        }

        //Using HashSet
        //HashSet hs=new HashSet();
        /*for(int i=0;i<s1.length();i++){
            if(!hs.add(s1.charAt(i))){
                System.out.println(s1.charAt(i));
                break;
            }
        }*/
    }

}
