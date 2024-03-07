package StringDemo.Problems;

public class evenLengthWord {
    public static void main(String[] args) {
        String s="I Am a vau hgb hjui";
        for(String a:s.split(" ")){
            if(a.length()%2==0){
                System.out.println(a);
            }
        }
    }
}
