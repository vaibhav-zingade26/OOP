package Array;

import java.util.Scanner;

public class AMxMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a size of an array");
        int size = sc.nextInt();
        int [] marks= new int[size];
        for(int i=0;i<size;i++){
            marks[i]=sc.nextInt();
        }
        int temp;
        for(int i=0;i<size;i++){
            for(int j=i+1;j<size;j++){
                if(marks[i]>marks[j]){
                    temp=marks[i];
                    marks[i]=marks[j];
                    marks[j]=temp;
                }
            }
        }
        for(int i=0;i<size;i++){
            System.out.print(marks[i]+" ");
        }
        System.out.println("min number is : "+marks[0]);
        System.out.println("max number is : "+marks[size-1]);


    }
}
