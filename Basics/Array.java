package Basics;
public class Array {
    public static void main(String[] args) {

        // Array

        // 1-D Array

        int[] arr = { 1, 2, 3, 4 };
        System.out.println("1-D Array");
        for (int num : arr) {
            System.out.print(num + " | ");
        }
        System.out.println();

        // 2-D Array

        int[][] Mat = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        System.out.println("2-D Array");
        for (int i = 0; i < Mat.length; i++) {
            for (int j = 0; j < Mat[i].length; j++) {

                System.out.print(Mat[i][j] + " ");
            }
            System.out.println();
        }

        // Jagged Array

        int[][] jagged = {
                { 1, 2 },
                { 3, 4, 5 },
                { 6, 7 }
        };
        System.out.println("Jagged Array");
        for (int i = 0; i < jagged.length; i++) {
            for (int j = 0; j < jagged[i].length; j++) {
                System.out.print(jagged[i][j] + " ");
            }
            System.out.println();
        }

        // Questions

        // Search an element in array

        int[] Sarr = { 1, 4, 5, 67, 5 };
        for (int num : Sarr) {
            if (num == 67) {
                System.out.println("Searched num is Found");
            }
        }

        // Find Max number

        int[] Marr = { 3, 4, 54, 3453, 5663, -2 };
        int Mres = Integer.MIN_VALUE;
        for (int i : Marr) {
            if (i > Mres) {
                Mres = i;
            }
        }
        System.out.println("Max num is : " + Mres);

        // Reverse Array

        int[] Rarr = { 1, 2, 34, 5, 67 };
        for (int i = Rarr.length - 1; i >= 0; i--) {
            System.out.print(Rarr[i] + " | ");
        }
        System.out.println();
        // sum of array

        int[] Sum_arr = { 1, 4, 7, 3, 8 };
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = Sum_arr[i] + sum;
        }
        System.out.println("Sum of array is : " + sum);

    }
}
