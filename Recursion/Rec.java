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

    //print fibonnaci series
    public static void printFab(int a,int b,int k){
        if(k==0){
            return;
        }
        int c=a+b;
        System.out.println(c);
        printFab(b,c, k-1);

    }

    //print x^p
    public static int printXResP(int x,int p){
        if(p==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        int xPowp=printXResP(x, p-1);
        int res=x*xPowp;
        return res;
    }

    //print xPown (stack height logn)
    public static int calcX(int q,int w){

        if(q==0){
            return 0;
        }
        if(w==0){
            return 1;
        }
        //if w is even
        if(w%2==0){
            return calcX(q, w/2)*calcX(q, w/2);
        }else{
            return calcX(q, w/2)*calcX(q, w/2)*q;
        }
    }

    public static void main(String[] args) {
        int n = 5;
        int m = 1;
        // print num n to 1
        printNum(n);
        // print num 1 to n
        printNumI(m);
        // calculate sum of n natural nums;
        System.out.println("Sum of natural num");
        prinSum(1, 5, 0);
        //print fact
        System.out.println("Factorial");
        int fact=printFact(5);
        System.out.println(fact);

        //print fibbonaci series
        System.out.println("Fibonacci series");
        int a=0,b=1;
        System.out.println(a);
        System.out.println(b);
        int k=7;
        printFab(a, b, k-2);

        //print x^n (stack height)
        System.out.println("Print x^p");
        int x=2;
        int p=5;
        int ans=printXResP(x, p);
        System.out.println(ans);
        

        
        //print x^n (stack height logn)
        System.out.println("Print x^p (logn)");
        int q=2;
        int w=5;
        int ans2=calcX(q, w);
        System.out.println(ans2);


    }

}
