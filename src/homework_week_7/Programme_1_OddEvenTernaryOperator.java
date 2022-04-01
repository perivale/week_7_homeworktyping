package homework_week_7;
import  java.util.Scanner;

/**1.write a java program that tells us that input number is odd or even?
 * hint:use ternary operator?
 */
public class Programme_1_OddEvenTernaryOperator {
    public static void main(String[] args) {
        //scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter the number:");
        int number = scanner.nextInt();
        isItOddOrEvenNumber(number);
        //closing the scanner object scanner.close();
    }

    //checking the number is odd or even
    public static void isItOddOrEvenNumber(int number) {
        //ternary opeartor is used
        String evenOrOdd = (number % 2 == 0) ? "Even" : "Odd";
        System.out.println("The" + number + number + "is" + evenOrOdd + "number");
    }
}






