package StringDemo.YouTubeProblems;

public class palindromeNumber {
    public static void isPalindrome(int no){
        int temp=no;
        int reverse=0;
        while(no>0){
            reverse=reverse*10+no%10;
            no=no/10;
        }
        if(reverse==temp){
            System.out.println("Palindrom");
        }else {
            System.out.println("Not palindrome");
        }

    }
    public static void main(String[] args) {
        isPalindrome(121);

    }
}
