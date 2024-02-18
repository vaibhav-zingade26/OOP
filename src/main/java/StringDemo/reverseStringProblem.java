package StringDemo;

public class reverseStringProblem {
    static String s = "madam";

    public static void main(String[] args) {
        String reverse="";
        System.out.println(s.length());
        for (int i =s.length()-1;i>=0;i--){
            reverse =reverse+s.charAt(i);
        }
        if(s.toLowerCase().equals(reverse)){
            System.out.println("The word is palindrome");
        }else{
            System.out.println("the word is not palidrome");
        }

    }
}
