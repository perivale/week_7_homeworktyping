package homework_week_7;


import java.util.Scanner;

/**
 * Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or
 * “ZERO”
 */
public class Programme_16_FindPositiveNegative {
    public static void main(String[] args) {
        //scaneer declaration for reading input from console
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number");
        int number=scanner.nextInt();
        findNumberIsPositiveNegativeOrZero(number);
        //closing the scanner obj
        scanner.close();

    }
   // finding the number is positive negative or zero
    public static void findNumberIsPositiveNegativeOrZero(int number) {
        if (number > 0){
            System.out.println(number + "is positive number");
    }else if(number <0) {
            System.out.println(number + "is a nagative number");
        }else {
            System.out.println(number+"number is zero");
        }


    }



}
