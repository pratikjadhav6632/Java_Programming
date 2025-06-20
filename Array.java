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

    }
}
