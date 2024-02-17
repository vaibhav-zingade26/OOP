package Array;

import java.util.Scanner;

public class transposePrint {
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

        System.out.println("The transpose print : ");

        for(int i=0;i<col;i++){
            for(int j=0;j<rows;j++){
                System.out.print(matrix[j][i]+" ");
            }
            System.out.println("");
        }
    }
}
