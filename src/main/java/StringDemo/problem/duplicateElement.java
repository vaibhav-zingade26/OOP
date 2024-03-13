package StringDemo.problem;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class duplicateElement {
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4, 2, 7, 8, 8, 3};
        Set<Integer> set = new HashSet<>();
        for(int a:arr){
            if(!set.add(a)){
                System.out.println("Duplicate number is : "+a);
            }
        }
        Arrays.sort(arr);
        Set<Integer> s = new HashSet<>();
        for(int b:arr){
            s.add(b);
        }
        System.out.println(s);
    }

}
