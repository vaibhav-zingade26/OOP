package StringDemo;

import java.util.Arrays;

public class anagrams {
    public static void main(String[] args) {
        String str1 = "The Morse Code";
        String str2 = "Here come dots";

        str1 =str1.toLowerCase();
        str2=str2.toLowerCase();

        if(str1.length()!= str2.length()){
            System.out.println("The both words are not anagrams");
        }else {

            char[] string1 = str1.toCharArray();
            char[] string2 = str2.toCharArray();

            Arrays.sort(string1);
            Arrays.sort(string2);

            if(Arrays.equals(string1, string2)){
                System.out.println("The both words are anagrams");
            }else {
                System.out.println("The both words are not anagrams");
            }




        }
    }
}
