package StringDemo;

public class alternate {
    public static void main(String[] args) {
        String str ="AbcdRFGY";
        char [] c=str.toCharArray();


        for(int i=0;i<str.length();i++){
            if(i%2==0 && Character.isUpperCase(c[i])){
                c[i]= '*' ;
            }
        }
       /* for(char ab:c){
            System.out.print(ab+"");
        }*/
        System.out.println(new String(c));
    }

}
