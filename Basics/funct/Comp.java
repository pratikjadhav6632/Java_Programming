package Basics.funct;
import java.util.*;
//check Greater than num
public class Comp {
    public static void isGreater(int a,int b){
        if(a>b){
            System.out.println("A is greater than B");
        }else{
             System.out.println("B is greater than A");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter A:");
        int a=sc.nextInt();

        System.out.println("Enter B:");
        int b=sc.nextInt();

        isGreater(a,b);
    }
}
