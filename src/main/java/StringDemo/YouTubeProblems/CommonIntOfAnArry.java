package StringDemo.YouTubeProblems;

import java.util.HashSet;
import java.util.Set;

public class CommonIntOfAnArry {
    public static void main(String[] args) {
        int[] a={23,34,55,33,1,56};
        int[] b={11,23,33,42};
        printIntersection(a,b);

    }
    public static boolean isPresentAllValueOfSecondArrayInFirst(int[] a,int[] b){
        return false;

    }
    public static  void printIntersection(int[] a,int[] b){
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<a.length;i++){
            set.add(a[i]);
        }
        for(int i=0;i<b.length;i++){
            if(set.contains(b[i])){
                System.out.print(b[i]+" ");
            }
        }


    }
}
