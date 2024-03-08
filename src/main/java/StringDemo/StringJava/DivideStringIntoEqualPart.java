package StringDemo.StringJava;

public class DivideStringIntoEqualPart {
    public static void main(String[] args) {
        String str = "aaaabbbbcccc";
        int n=3;
        String[] equalStr = new String[n];
        int temp=0;


        if((str.length()%n)!=0){
            System.out.println("Not possible equal parts");
        }else{
            for(int i=0;i<str.length();i=i+(str.length()/n)){
                String part=str.substring(i,i+(str.length()/n));
                equalStr[temp]=part;
                temp++;
            }
        }
        for(String s:equalStr){
            System.out.println(s+" ");
        }

    }
}
