public class Methods {
    public static void main(String[] args) {

        // create sum method
        System.out.println(sum(1, 2));

        //Method overloading (same method name with diff parameters);
        System.out.println(sum(1, 2,5));

        // multiple args
        System.out.println(Msum(3, 100, 34, 54, 1000));

        // check n Prime numbers
        System.out.println(Prime(13));
        System.out.println(Prime(12));

        System.out.println(Fact(6));
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    //Method overloading (same method name with diff parameters);
    public static int sum(int a,int b,int c){
        return a+b+c;
    }

    public static int Msum(int... a) {
        int sum = 0;
        for (int i : a) {
            sum += i;
        }
        return sum;
    }

    public static boolean Prime(int x){
        int res=0;
        for(int i=1;i<=x;i++){
            if(x%i==2){
                res++;
            }
        }
        return res==2;
    }

    public static int Fact(int x){
        int res=1;
        while(x>0){
            res=res*x;
            x--;
        }
        return res;
    }
    
}
