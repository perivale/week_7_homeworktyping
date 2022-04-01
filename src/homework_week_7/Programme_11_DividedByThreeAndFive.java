package homework_week_7;
/**
 * Write a java program to print the numbers between 1 to 100 which can be divided by 3
 * and 5 separately.
 */
public class Programme_11_DividedByThreeAndFive {
    public static void main(String[] args) {
        System.out.println("number divisible bt 3 are");
        for (int i = 1; i <= 100; i++) {
            dividedByThree(i);

        }
        System.out.println("\n_-------------------------------------------");
        System.out.println("number divisible by 5 are");
        for (int x = 1; x <= 100; x++) {
            diviedByFive(x);
        }

    }

    private static void dividedByThree(int i) {
    }

    //divides by three method
    public static void diviedByThree(int number) {
        if (number % 3 == 0) {
            System.out.println(number + " , ");

        }
    }

    //divied by five method
    public static void diviedByFive(int number) {
        if (number % 5 == 0) {
            System.out.println(number + ",");
        }
    }
}
