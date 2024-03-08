package StringDemo.YouTubeProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class SmallerThanAnyNumber {
    public static void main(String[] args) {
        int[] num={1,2,4};
        int[] ans = new int[num.length];
        for(int i=0;i<num.length;i++){
            int count=0;
            for(int j=0;j<num.length;j++){
                if(num[j]<num[i] && i!=j){
                    count++;
                }
                ans[i]=count;
            }
        }
       for(int b:ans){
           System.out.print(b+" ");
       }
    }
}
