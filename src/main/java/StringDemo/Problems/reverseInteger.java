package StringDemo.Problems;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class reverseInteger {
    public static void main(String[] args) {
     /*   int number =112233;
        int reverseNumber=0;
        while(number!=0){
            int digit = number%10;
            reverseNumber=reverseNumber*10+digit;
            number=number/10;
        }
        System.out.println(reverseNumber);*/
        int [] a={1,2,4,5,6,78,89,9,6,43,67,78,43};
        Set<Integer> s = new HashSet<>();
        for(int b:a){
            s.add(b);
        }
        System.out.println(s);
        int[] arr1=new int[s.size()];
        int count=0;
        for(int x:s){
            arr1[count]=x;
            System.out.print(arr1[count]+" ");
            count++;
        }
        System.out.println(" ");
        Arrays.sort(arr1);
        System.out.println("Maximun 3rd number : "+arr1[arr1.length-3]);
    }
}
