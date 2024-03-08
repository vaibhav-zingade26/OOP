package StringDemo.StringJava;

public class reverseString {
    public static void main(String[] args) {
        String string = "Dream big";
       /* String reverString ="";
        for(int i=string.length()-1;i>=0;i--){
            reverString+=string.charAt(i);
        }
        System.out.println(reverString);*/
        //using StringBulider
        StringBuilder sb = new StringBuilder(string);
        sb.reverse();
        sb.toString();
        System.out.println(sb);
    }
}
