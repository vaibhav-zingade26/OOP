package StringDemo.Problems;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class problem2 {
    public static void main(String[] args) {
        int[] arr1 = {1,3,478,4,5,6,7};
        int[] arr2 = new int[arr1.length];
        int max=arr1[0];
        int min=arr1[0];

        for(int i=0;i<arr1.length;i++){
            arr2[i] = arr1[i];
        }
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        Set<Integer> hs = new HashSet<>();
        for(int ab:arr1){
            if(!hs.add(ab)){
                System.out.println("dublicate number is : "+ab);
            }
        }

        for(int i=0;i<arr1.length;i++){
            if(max<arr1[i]){
                max=arr1[i];
            }
        }
        System.out.println("maximum number is : "+max);
        for(int i=0;i<arr1.length;i++){
            if(min>arr1[i]){
                min=arr1[i];
            }
            }
        System.out.println("minimum number is : "+min);
    }
}
