public class Loops{
    public static void main(String[]args){

        //While
        int i=1;
        while (i<=10) {
            System.out.println(i);
            i++;
        }

        //do-while

        int num=1;
        do{
            System.out.println("Hello World");
            num++;
        }while(num<=10);

        //for

        for(int m=0;m<10;m++){
            System.out.println("m :"+m);
        }

        //nested for

        for(int k=0;k<10;k++){
            for(int j=0;j<=k;j++){
                System.out.print("*");
            }
            System.out.println();
        }



        //Questions 

        //create table of 7
        for(int s=1;s<=10;s++){
            System.out.println(s+"  X  7  : "+s*7);
        }

        //sum of first 10 natural numbers

        int sum=0;
        int n=1;
        while (n<=10) {
            sum=sum + n;
            n++;
        }
        System.out.println("Sum of first 10 natural num : "+sum);

        //count digit of a number '46789566'

        int d=46789566;
        int res=0;
        while(d>0){
            d=d/10;
            res++;
        }
        System.out.println("Total count of digit is : "+res);

        //factorial of a number '6'

        int f=6;
        int resu=1;
        while (f>0) {
            resu=f*resu;
            f--;
        }
        System.out.println(resu);


        //print * pattern as given below
        /*
         * 
         **
         *** 
         ****
         ***** 
         */

         for(int star=0;star<5;star++){
            for(int p=0;p<=star;p++){
                System.out.print("*");
            }
            System.out.println();
         }
    }
}