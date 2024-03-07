package StringDemo;

public class problem1 {
    public static void main(String[] args) {
        String s= "ACB2348BGHyhu";
        int sum =0;
        char[] a = s.toCharArray();
        for(int i=0;i<s.length();i++){
            if(Character.isDigit(a[i])){
                sum+=Character.getNumericValue(a[i]);
            }
        }
        System.out.println(sum);
    }
}
