package Recursion;

public class Rec {
    // print num from n to 1;
    public static void printNum(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        printNum(n - 1);
    }

    // print num from 1 to n;
    public static void printNumI(int m) {
        if (m == 5) {
            return;
        }
        System.out.println(m);
        printNumI(m + 1);
    }

    // calculate sum of n natural nums;
    public static void prinSum(int i, int n, int sum) {
        if (i == n) {
            sum += i;
            System.out.println(sum);
            return;
        }
        sum += i;
        prinSum(i + 1, n, sum);
    }

    //print fact of n 
    public static int printFact(int n){
        if(n==1 || n==0){
            return 1;
        }
        int fact_nm1=printFact(n-1);
        int fact_n=n*fact_nm1;
        return fact_n;

    }

    public static void main(String[] args) {
        int n = 5;
        int m = 1;
        // print num n to 1
        printNum(n);
        // print num 1 to n
        printNumI(m);
        // calculate sum of n natural nums;
        prinSum(1, 5, 0);
        //print fact
        int fact=printFact(5);
        System.out.println(fact);
    }

}
