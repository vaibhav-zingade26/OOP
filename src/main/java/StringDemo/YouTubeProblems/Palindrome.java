package StringDemo.YouTubeProblems;

public class Palindrome {
    public static boolean isPalindrome(String input){
        input=input.toLowerCase();
        int start =0;
        int end = input.length()-1;
        while(end>start){
            if(input.charAt(start)!=input.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public static void main(String[] args) {
        String line ="My Name id Nitin and I am speack malayalam";
        String[] words =line.split(" ");
        for (int i=0;i<words.length;i++){
            if(isPalindrome(words[i])){
                System.out.println(words[i]);
            }
        }

    }
}
