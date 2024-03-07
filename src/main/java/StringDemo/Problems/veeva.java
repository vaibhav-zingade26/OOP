package StringDemo.Problems;

import javax.xml.crypto.dsig.spec.HMACParameterSpec;
import java.util.HashMap;
import java.util.HashSet;

public class veeva {
    public static int removeDeplicate(int[] num){
        int atualSizeArray=0;
        for(int i=1;i<num.length;i++){
            if(num[i]!=num[i-1]){
                num[atualSizeArray]=num[i];
                atualSizeArray++;
            }
        }
        return atualSizeArray;
    }
    public static void main(String[] args) {
        int[] a={1,2,2,3,43,5,2,1,3,3,4,2,3,4,3};
        System.out.println(removeDeplicate(a));









        /*String s="vaibhavzingade";
        char [] a=s.toCharArray();
        HashMap<Character,Integer> hm = new HashMap<>();
        for(char c:a){
            if(hm.containsKey(c)){
                hm.put(c,hm.get(c)+1);
            }else{
                hm.put(c,1);
            }
        }
        System.out.println(hm);
*/
        /*int[] a ={1,2,4,3,4,7,2,4};
        int temp;
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]>a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        for(int b:a){
            System.out.print(b+" ");
        }*/
        /*int[] a={2,3,3,4,8,6,5,4};int min =a[0];
        for(int i=0;i<a.length;i++){
            if(min>a[i]){
                min=a[i];
            }
        }
        System.out.println("min  : "+min);*/

       /* for(int i=0;i<a.length;i++){
            if(max<a[i]) max=a[i];
        }
        System.out.println("Max number is "+max);*/
        /*for(int i=a.length-1;i>=0;i--){
            System.out.print(a[i]+" ");
        }*/

        //Print prime number between 1 to 100
         /*for(int i=2;i<=100;i++){
             int count =0;
             for(int j=2;j<i/2;j++){
                 if(i%j==0){
                     count++;
                 }
             }
             if(count==0){
                 System.out.print(i+" ");
             }
         }
*/
        /*int n=5;int count=0;
        for(int i=2;i<(n/2);i++){
            if(n%i==0){
                System.out.println("Not Prime Number");
            }
        }
        System.out.println("Prime Number");*/
       /* if(count==0){
            System.out.println("Prime Number");
        }else{
            System.out.println("Not Prime number");
        }*/

        /*int[] a={1,2,3,4,5};
        int[] b={1,2,3};
        int[] c ={1,2,3,4};

        for(int i=0;i<a.length;i++){

        }*/

    }

}
