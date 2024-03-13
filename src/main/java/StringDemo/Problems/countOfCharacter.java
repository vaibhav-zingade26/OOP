package StringDemo.Problems;

public class countOfCharacter {
    public static void main(String[] args) {
        String s="vai   ";
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=' '){
                count++;
            }
        }
        System.out.println("number of characters are : "+count);
    }


}
