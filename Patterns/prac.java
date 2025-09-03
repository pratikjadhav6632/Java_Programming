package Patterns;
import java.util.*;
public class prac {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter vAlue of N:");
        int n=sc.nextInt();

        System.out.println("Solid Rectangle");
        //solid rectangle
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }

        
        //Hollow recatngle
        System.out.println("Hollow Reactangle");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==1 || j==1 || i==n || j==n){
                    System.out.print(" * ");
                }else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }

        //Half pyramid
        System.out.println("Half Pyramid");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }

        //Inverted Half pyramid 
        System.out.println("Inverted Half Pyramid");
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }


        //inverted Half Pyramid (180 deg)
        System.out.println("Inverted Half Pyramid (180deg)");
        for(int i=1;i<n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("   ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
