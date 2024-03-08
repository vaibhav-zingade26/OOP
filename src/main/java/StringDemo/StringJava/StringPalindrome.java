package StringDemo.StringJava;

public class StringPalindrome {
    public static void main(String[] args) {
        String string = "Kayako";
        int flag=0;
        string=string.toLowerCase();
        for(int i=0;i<string.length()/2;i++){
            if(string.charAt(i)!=string.charAt(string.length()-1-i)){
                flag=1;
                break;
            }
        }
        if(flag==0){
            System.out.println("The String is Palindrome");
        }else {
            System.out.println("The String is not Palindrome");
        }
    }
}
