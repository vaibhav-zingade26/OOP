package StringDemo.Problems;

public class reverseNumber {
    public static void main(String[] args) {
        int a =112233;
        int reverseNumber =0;
        while(a>0){
            reverseNumber=reverseNumber*10+a%10;
            a=a/10;
        }
        System.out.println(reverseNumber);
    }
}
