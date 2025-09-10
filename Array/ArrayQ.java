package Array;
import java.util.*;
public class ArrayQ {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int row;
        int cols;

        System.out.println("Enter no.of row :");
        row=sc.nextInt();

        System.out.println("Enter no of cols : ");
        cols=sc.nextInt();

        int[][] num=new int [row][cols];

        //input
        for(int i=0;i<row;i++){
            for(int j=0;j<cols;j++){
                System.out.print("Enter elemnt of "+i+" "+j+" ");
                num[i][j]=sc.nextInt();
            }
        }

        //display
        for(int i=0;i<row;i++){
            for(int j=0;j<cols;j++){
                System.out.print(num[i][j]+" ");
            }
            System.out.println();
        }

        int dest;
        boolean found=false;
        System.out.print("Enter no to search : ");
        dest=sc.nextInt();

        for(int i=0;i<row;i++){
            for(int j=0;j<cols;j++){
                if(dest==num[i][j]){
                    System.out.println("no found at index "+ i +" " +j);
                     found=true;
                    break;
                }
            }
            if(found)break;
        }
        if(!found){
            System.out.println("no is not found");
        }
    }
}
