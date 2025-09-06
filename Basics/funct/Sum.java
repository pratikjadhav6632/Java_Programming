package Basics.funct;
import java.util.*;
//Sum of all upto n odd numbers 
public class Sum {
    public static int sum(int n){
        int res=0;
        for(int i=1;i<=n;i++){
            if(i%2!=0){
                res +=i;
            
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter n:");
        int n=sc.nextInt();

        System.out.println(sum(n));

    }
}
