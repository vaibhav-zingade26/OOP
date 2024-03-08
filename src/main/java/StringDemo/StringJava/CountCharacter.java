package StringDemo.StringJava;

public class CountCharacter {
    public static void main(String[] args) {
        String s="The ?";
        System.out.println(s.trim());
        System.out.println(s.length());
        //will remove side spaces.
        int count =0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=' '){
                count++;
            }
        }
        System.out.println("Number of characters are : "+count);
    }
}
