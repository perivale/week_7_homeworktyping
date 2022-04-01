package homework_week_7;

import java.util.Scanner;
/**
 * Write a java program to input any number and find out if it’s odd or even
 */

public class Programme_6_OddEven {
    public static void main(String[] args) {
        //scanner declearation for reading input from console
        Scanner scanner =new Scanner(System.in);
        System.out.println("enter the number you wont to check;");
        int number=scanner.nextInt();
         Programme_6_OddEven oddEven= new Programme_6_OddEven();
        System.out.println(number+"is"+oddEven.isItEvenOrOddNumber(number));
        //closing the scaneer object
        scanner.close();
    }
    //checking odd or even
    public String isItEvenOrOddNumber(int number){
        if(number %2==0){
    return "Even";
        }else{
    return "Odd";
        }


    }

}
