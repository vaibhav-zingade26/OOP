package org.OOP_Concepts;

import org.w3c.dom.ls.LSOutput;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 5, 8, 9, 7, 8, 9};
        System.out.println(getThirdLargestNumber(a));
        //FileInputStream fis = new FileInputStream("");*/
  /*  try{
        int a=100,b=0;
        int c = a/b;
        System.out.println(c);
    }catch (Exception e){
        System.out.println(e);
    } */


        //_________to copy the array elements from one array to another:______________
        int[] ab = {1, 2, 3, 4, 5, 6, 5, 8, 9, 7, 8, 9};
        int[] b = new int[a.length];
        // System.out.println(a[2]);
        /*for(int i=0;i<a.length;i++){
            b[i]=a[i];
            System.out.print(b[i]);
        }*/


        //find the duplicate element in array
      /*  List<Integer> duplicate = new ArrayList<>();
        Set<Integer> hs = new HashSet<>();
        for(int duplicateValue : a){
            if(hs.add(duplicateValue)){
              //  System.out.println("value is distinct");
            }else{
                duplicate.add(duplicateValue);
            }
        }
        System.out.println(duplicate);*/

//int [] a = {1,2,3,4,5,6,5,8,9,7,8,9};
        /*for (int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j]){
                    System.out.println("duplicate value : "+a[j]);
                }
            }
        }*/


        //print array in reverse order:

        /*for(int i=a.length-1;i>=0;i--){
            System.out.print(a[i] +" ");
            }*/

       /* int[] abc = {34,6,67,89,67,899};
        int min = abc[0];
        for(int i=0;i<abc.length;i++){
            if(abc[i]<min){
                min = abc[i];
            }
        }
        System.out.println("max number is "+min);*/
        ///swapping of two number
       /* int x=100,y=78;
        x=x+y;
        System.out.println(x);
        y=x-y;
        System.out.println(y);
        x=x-y;
        System.out.println(x);

        System.out.println("x: "+x+" y: "+y);*/

       /* String Name = "Vaibhav Zingade";
        System.out.println(Name.length());

        char [] intoArray = Name.toCharArray();
        int count=0;
        for(char i:intoArray){
            count++;
        }
        System.out.println(count);*/

       /* String str1 = "And";
        str1 = str1.replaceAll("A","Ra");
        System.out.println(str1);*/
       // x = {5, 2, 8, 7, 1};
       /* int sum=0;
        for(int y:x){
            sum=sum+x[y];
        }
        System.out.println(sum);*/
    }

    public static int getThirdLargestNumber(int [] arr){
        int temp;

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
       /* for(int i=0;i<x.length;i++){
            System.out.print(x[i]+" ");
        }*/
        return  arr[arr.length-3];
    }


    }

