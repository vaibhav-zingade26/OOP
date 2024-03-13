package StringDemo.ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class demo {
    public static void handling(int a,int b) throws FileNotFoundException {

        FileInputStream fs=new FileInputStream("vaibhav"); //checked exception
        throw new FileNotFoundException();




    }
    public static void main(String[] args){
       //handling(10,0);
        System.out.println("hello");

         //   FileInputStream fs = new FileInputStream("vbhn");

                int a[]=new int[5];
                a[5]=30/0;


        }

}
