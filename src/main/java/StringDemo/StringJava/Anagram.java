package StringDemo.StringJava;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String str1="bragi";
        String str2="grab";


        if(str1.length()!=str2.length()){
            System.out.println("Not Anagram");
        }else{
            char[] s1=str1.toCharArray();
            char[] s2=str2.toCharArray();

            Arrays.sort(s1);
            Arrays.sort(s2);
           /* for(char a:s1){
                System.out.print(a);
            }
            for(char a:s2){
                System.out.print(a);
            }*/
            if(Arrays.equals(s1,s2)){
                System.out.println("Anagram");
            }else {
                System.out.println("Not Anagram");
            }
        }
    }
}
