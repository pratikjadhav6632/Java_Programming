package Patterns;
public class P11 {
    public static void main(String[] args) {
        int n=5;

        //Upper half
        for(int i=1;i<=n;i++){

            //left side
            for(int j=1;j<=i;j++){
                System.out.print(" * ");
            }

            //Spaces
            int space = 2*(n-i);
            for(int j=1;j<=space;j++){
                System.out.print("   ");
            }

            //right side
            for(int j=1;j<=i;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }

        //Lower half
        for(int i=n;i>=1;i--){

            //left side
            for(int j=1;j<=i;j++){
                System.out.print(" * ");
            }

            //Spaces
            int space = 2*(n-i);
            for(int j=1;j<=space;j++){
                System.out.print("   ");
            }

            //right side
            for(int j=1;j<=i;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
