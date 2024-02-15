package org.OOP_Concepts;

import org.w3c.dom.ls.LSOutput;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //FileInputStream fis = new FileInputStream("");*/
  /*  try{
        int a=100,b=0;
        int c = a/b;
        System.out.println(c);
    }catch (Exception e){
        System.out.println(e);
    } */


     //_________to copy the array elements from one array to another:______________
        int [] a = {1,2,3,4,5,6,5,8,9,7,8,9};
        int [] b = new int[a.length];
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

        int[] abc = {34,6,67,89,67,899};
        int min = abc[0];
        for(int i=0;i<abc.length;i++){
            if(abc[i]<min){
                min = abc[i];
            }
        }
        System.out.println("max number is "+min);
      ///swapping of two number
       /* int x=100,y=78;
        x=x+y;
        System.out.println(x);
        y=x-y;
        System.out.println(y);
        x=x-y;
        System.out.println(x);

        System.out.println("x: "+x+" y: "+y);*/



        }

    }

