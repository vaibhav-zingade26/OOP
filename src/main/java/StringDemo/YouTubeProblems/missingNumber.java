package StringDemo.YouTubeProblems;

public class missingNumber {
    public static void main(String[] args) {
        int[] a ={1,2,4,5,6,7,8,9,10};
        int sum=55;
        int actualSum=0;
        for(int i=0;i<a.length;i++){
            actualSum+=a[i];
        }
        int missingNumber = sum-actualSum;
        System.out.println("missing number is :"+missingNumber);
    }
}
