package Array;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a size of an array");
        int size = sc.nextInt();
        int [] marks= new int[size];
        int desiredMarks=98;
        System.out.println("enter a marks");
        for(int i=0;i<size;i++){
            marks[i]=sc.nextInt();
        }
        for(int i=0;i<size;i++){
            System.out.print(marks[i]+" ");
        }
       /* for (int x=0;x<size;x++){
            if(marks[x]==desiredMarks){
                System.out.println("index of desiredMarks : "+x);
            }*/



    }


}
