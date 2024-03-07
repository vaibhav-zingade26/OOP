package Accenture;

public class main {
    public static void removeChar(String s,char remove){
        String str=s.toLowerCase();
        StringBuilder s1= new StringBuilder("");
        // char[] a =str.toCharArray();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=remove){
                s1=s1.append(str.charAt(i));
            }
        }
        System.out.println(s1);

    }
    public static void main(String[] args) {
       // String str ="CloudTech";
        removeChar("CloudTech",'t');

    }
}
