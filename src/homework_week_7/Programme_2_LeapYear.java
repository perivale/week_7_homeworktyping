package homework_week_7;

import java.util.Scanner;
/*
write a java programme to input any year like (ex.2007)and find out if it is leap year or not?
*/
public class Programme_2_LeapYear {

    public static void main(String[] args) {
        //scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter the year");
        int Year = scanner.nextInt();
        Programme_2_LeapYear leapYear = new Programme_2_LeapYear();
        leapYear.isItLeapYear(Year);
        //closing the scanner object
        scanner.close();
    }
    //checking is it leap year or not

        public void isItLeapYear(int Year){
           if(Year%4==0 && Year%100!=0||Year%400==0){
                System.out.println("");
            }
        }



    }
