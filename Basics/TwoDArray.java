package Basics;
import java.util.*;
public class TwoDArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int row;
        int cols;

        System.out.println("Enter No.of rows : ");
        row=sc.nextInt();

        System.out.println("Enter No.of cols : ");
        cols=sc.nextInt();

        int [][] num=new int[row][cols];

        //input
        for(int i=0;i<row;i++){
            for(int j=0;j<cols;j++){
                System.out.println("Enter element of "+i +" "+j);
                num[i][j]=sc.nextInt();
            }
        }

        //output
        System.out.println("2D Matrix ");
        for(int i=0;i<row;i++){
            for(int j=0;j<cols;j++){
                System.out.print(num[i][j]+" ");
            }
            System.out.println();
        }

    }
}
