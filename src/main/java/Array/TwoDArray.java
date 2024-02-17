package Array;

import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int col = sc.nextInt();
        int [][] matrix = new int[rows][col];

        for(int i=0;i<rows;i++){
            for(int j=0;j<col;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter a number of which yo want to see the index");
        int x =sc.nextInt();
        for(int i=0;i<rows;i++){
            for(int j=0;j<col;j++){
                if(matrix[i][j]==x){
                    System.out.println("The position is "+i+"X"+j);
                }else{
                    System.out.println("Number is not exist");
                }
            }
        }
        /* OutPut
        for(int i=0;i<rows;i++){
            for(int j=0;j<col;j++){
               // matrix[rows][col]=sc.nextInt();
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }*/
    }
}
