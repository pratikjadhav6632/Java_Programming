public class conditionalState {
    public static void main(String[] args) {

        int age = 19;

        // if

        if (age >= 18) {
            System.out.println("Adult");
        } // Adult

        // if-else

        if (age <= 18) {
            System.out.println("Teenager");
        } else {
            System.out.println("Adult");
        } // Adult

        // if-else_if-else (nested if else)
        int marks = 75;
        if (marks >= 95) {
            System.out.println("Grade A");
        } else if (marks >= 75) {
            System.out.println("Grade B");
        } else if (marks >= 65) {
            System.out.println("Grade C");
        } else {
            System.out.println("Grade D");
        } // Grade B

        // Switch case

        int day = 2;
        switch (day) {
            case 1:
                System.out.println("Monaday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;

            default:
                System.out.println("Invalid Day");
                break;
        }//Tuesday
    }
}
