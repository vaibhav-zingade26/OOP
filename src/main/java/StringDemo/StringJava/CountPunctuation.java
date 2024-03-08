package StringDemo.StringJava;

public class CountPunctuation {
    public static void main(String[] args) {
        String s ="He said, 'The mailman loves you.' I heard it with my own ears.";
        int count=0;
        for(int i=0;i<s.length();i++){
            if(Character.isAlphabetic(s.charAt(i))||s.charAt(i)==' '){
                count++;
            }
        }
        int CountPunctuation = s.length()-count;
        System.out.println("Count of Punctuation : "+CountPunctuation);
    }
}
