package StringDemo.Problems;

public class main {
    public static void main(String[] args) {
        String s="VF123HBH567";
        char[] a = s.toCharArray();
        int sum =0;
        for(int i=0;i<s.length();i++){
            if(Character.isDigit(a[i])){
               sum =sum+Character.getNumericValue(a[i]);
            }
        }
        System.out.println("Sum of digit : "+sum);
    }
}
