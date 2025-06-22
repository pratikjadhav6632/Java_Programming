public class Recursion {
    public static void main(String[]args){

        System.out.println(factorial(6));
        System.out.println(sumOfNnatuaralNum(10));
        
    }
    //Recursion 

    //find factorial of 'X' number
    public static int factorial(int x){
        if(x==1){
            return 1;
        }
        return x * factorial(x-1);
    }

    //find sum of 'x' natural numbers
    public static int sumOfNnatuaralNum(int x){
        if(x==1){
            return 1;
        }
        return x + sumOfNnatuaralNum(x-1);
    }
}
