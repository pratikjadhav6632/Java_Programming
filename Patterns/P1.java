package Patterns;
import java.util.*;
public class P1 {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of N:");
        int n=sc.nextInt();
        
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
