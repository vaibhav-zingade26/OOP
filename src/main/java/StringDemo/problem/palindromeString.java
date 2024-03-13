package StringDemo.problem;

public class palindromeString {
    public static void main(String[] args) {
        String string = "Vaibhav";
        string=string.toLowerCase();
        boolean flag=true;

        for(int i=0;i<string.length();i++){
            if(string.charAt(i)!=string.charAt(string.length()-1-i)){
                flag=false;
                break;
            }
        }
        if(flag){
            System.out.println("Palindrome");
        }else {
            System.out.println("Not Palindrome");
        }
    }
}
