public class ArtmeticOperator {
    public static void main(String[] args) {
        int a = 5;
        int b = 4;

        
  
        // Arithmetic Operations
            System.out.println("Add result->" + (a + b)); // 9
            System.out.println("Sub result->" + (a - b)); // 1
            System.out.println("Mul result->" + (a * b)); // 20
            System.out.println("Div result->" + (a / b)); // 1
            System.out.println("Mod result->" + (b % 2)); // 0

        // Increment & decrement

            // (post Increment & decrement)
            System.out.println(a++);// 5
            System.out.println("After Increment " + a); // 6
            System.out.println(a--);// 6
            System.out.println("After Decrement " + a);// 5

            // (pre Increment & decrement)
            System.out.println("before increment " + a);// 5
            System.out.println(++a);// 6
            System.out.println("before decrement " + a);// 6
            System.out.println(--a);// 5

        //Compound Assignment Operators

         
            a+=5;
            System.out.println( "Compond Addition "+a);
            a-=5;
            System.out.println( "Compound Sub "+a);
             a*=5;
            System.out.println( "Compound mul "+(a));
             a/=5;
            System.out.println( "Compound Div "+(a));

    }
}
