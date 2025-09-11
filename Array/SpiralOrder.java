package Array;

import java.util.*;

public class SpiralOrder {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int row=4;
        int col=4;
        System.out.println("Number of row are : "+row);
        System.out.println("Number of col are : "+col);

        int [][]mat={
            {1,2,3,4},
            {5,6,7,8},
            {8,9,1,6},
            {5,7,6,7}
        };
        System.out.println("Matrix is");
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat.length;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }

        //Spiral mat
        System.out.println("SPiral matrix is ");
        int s_row=0,e_row=mat.length-1;
        int s_col=0,e_col=mat.length-1;
        while(s_row<=e_row && s_col<=e_col){
            //top
            for(int j=s_col;j<=e_col;j++){
                System.out.print(mat[s_row][j] + " ");
            }
            s_row++;

            //right
            for(int i=s_row;i<=e_row;i++){
                System.out.print(mat[i][e_col] + " ");
            }
            e_col--;

            //bootom
            for(int j=e_col;j>=s_col;j--){
                System.out.print(mat[e_row][j] + " ");
            }
            e_row--;

            //right
            for(int i=e_row;i>=s_row;i--){
                System.out.print(mat[i][s_col] + " ");
            }
            s_col++;
            System.out.println();
        }
    }
}