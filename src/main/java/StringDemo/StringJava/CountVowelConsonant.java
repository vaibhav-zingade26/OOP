package StringDemo.StringJava;

public class CountVowelConsonant {
    public static void main(String[] args) {
        String s="This is a really simple sentence";
        //System.out.println(s.length());
        s=s.toLowerCase();
        s=s.replaceAll("\\s","");
        //System.out.println(s);
        //System.out.println(s.length());
        int count =0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
                count++;
            }
        }
        System.out.println("Count of vowels : "+count);
        System.out.println("Count of Consonent : "+(s.length()-count));
    }
}
