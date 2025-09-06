package Basics.funct;
import java.util.*;
public class Avg {
    public static int avg(int a ,int b,int c){
        int avg=((a+b)+c)/3;
        return avg;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter A:");
        int a=sc.nextInt();

        System.out.println("Enter B:");
        int b=sc.nextInt();

        System.out.println("Enter C:");
        int c=sc.nextInt();

        System.out.println("Avg of A/B/C is "+avg(a,b,c));
    }
}
