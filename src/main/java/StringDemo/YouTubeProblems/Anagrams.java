package StringDemo.YouTubeProblems;

import java.util.Arrays;

public class Anagrams {
    public static boolean isAnagram(String s1,String s2){
        if(s1.length()!=s2.length()){
            return false;
        }
        char[] a =s1.toCharArray();
        char[] b =s2.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        if(Arrays.equals(a,b)){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        String s1 ="abc";
        String s2 ="bcb";
        if(isAnagram(s1,s2)){
            System.out.println("is Anagrams");
        }else {
            System.out.println("Not an Anagrams");
        }
    }
}
