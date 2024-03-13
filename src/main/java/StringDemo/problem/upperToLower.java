package StringDemo.problem;

public class upperToLower {
    public static void main(String[] args) {
        String str1="Great Power";
        StringBuilder newstr = new StringBuilder(str1);
        for(int i=0;i<str1.length();i++){
            if(Character.isUpperCase(str1.charAt(i))){
                newstr.setCharAt(i,Character.toLowerCase(str1.charAt(i)));
            }
            if(Character.isLowerCase(str1.charAt(i))){
                newstr.setCharAt(i,Character.toUpperCase(str1.charAt(i)));
            }
        }
        System.out.println("New string : "+newstr);
    }
}
