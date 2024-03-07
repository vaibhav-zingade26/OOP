package StringDemo.Problems;

import java.util.HashMap;
import java.util.HashSet;

public class duplicate {
    public static void main(String[] args) {
        int [] a ={1,2,3,4,3,2,1,4,5,6};
        HashMap<Integer,Integer> hs = new HashMap<>();
        for(int i=0;i<a.length;i++){
            if(hs.containsKey(a[i])){
                hs.put(i,hs.get(a[i])+1);
            }else{
                hs.put(i,1);
            }
        }
        System.out.println(hs);
    }
}
