public class BitwiseOperator {
    public static void main(String[] args) {
        int a = 5;// 101
        int b = 4;// 100
        System.out.println(Integer.toBinaryString(a));
        System.out.println(Integer.toBinaryString(b));

        // Bitwise Oerators

        System.out.println("AND Result " + (a & b));// 4 (100)
        System.out.println("OR Result " + (a | b));// 5 (101)
        System.out.println("NOT Result " + (~a));// -6 (...111010)
        System.out.println("XOR Result " + (a ^ b));// 1 (001)
        System.out.println("Left Shift Result " + (a << 1));// 10 (1010)
        System.out.println("Right Shift Result " + (a >> 1));// 2 (010)
        System.out.println("Unsigned Right Shift Result " + (-a >>> b));// 268435455 

    }
}