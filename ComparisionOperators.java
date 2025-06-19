public class ComparisionOperators {
    public static void main(String[]args){

        int a=2;
        int b=3;

        //Realational Operators

        //== (euqal to)
        System.out.println("a euqal to b : "+(a==b));//false

        // != (not equal)
        System.out.println("a not equal to b : "+(a!=b));//true

        // < (less than)
        System.out.println("a less than b : "+(a<b));//true

        // > (greater than)
        System.out.println("a greater than b : "+(b>a));//true

        //<= (less than equal)
        System.out.println("a less than equal to b : "+(a<=2));//true

        // >= (greater than equal)
        System.out.println("a greater than  equal to b : "+(a>=1));//true



        int age =20;
        int exp=5;
        boolean cond1= age>18;
        boolean cond2=exp>6;

        //Logical Operators

        //&& (Logical AND)

        System.out.println("Cond1 and cond2 Both should be true : "+(cond1 && cond2));//false

        // || (logical OR)
        System.out.println("Cond1 and Cond2 at least one should be true : "+(cond1 || cond2));//true

        // ! (Logical NOT)
        System.out.println("age not equal 21 : "+(age != 21));//true

    

    }
}
