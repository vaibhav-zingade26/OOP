package Array;

import java.util.Scanner;

public class SpiralPrint {
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
        System.out.println("The spiral order Matrix is : ");

        int rowStart=0;
        int rowEnd=rows-1;
        int colStart=0;
        int colEnd=col-1;

        while(rowStart<=rowEnd && colStart<=colEnd){

            for(int column=colStart;column<=colEnd;column++){
                System.out.print(matrix[rowStart][column]+" ");
            }
            rowStart++;

            for(int ro=rowStart;ro<=colEnd;ro++){
                System.out.print(matrix[ro][colEnd]+" ");
            }
            colEnd--;
            for(int column=colEnd;column>=colStart;column--){
                System.out.print(matrix[rowEnd][column]+" ");
            }
            rowEnd--;
            for(int ro=rowEnd;ro<=rowStart;ro++){
                System.out.print(matrix[ro][colStart]+" ");
            }
            colStart++;
        }

    }
}
