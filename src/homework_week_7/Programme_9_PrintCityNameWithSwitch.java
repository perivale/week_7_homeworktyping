package homework_week_7;

import java.util.Scanner;

/**
 * Input any alphabet from “A to “F” and print their city name accordingly (use if else) if
 * any other alphabet should be invalid entry USING SWITCH STATEMENT
 */

public class Programme_9_PrintCityNameWithSwitch {
    public static void main(String[] args) {
        //scanner declearation for reading input from console
        Scanner scanner =new  Scanner(System.in);
        System.out.println(("please alphebet between A to F::"));
        String city =scanner.next().toUpperCase();
        //create obj and call instance method
        Programme_9_PrintCityNameWithSwitch cityname=new Programme_9_PrintCityNameWithSwitch();
        cityname.printcityName(city);
        //closing the scanner object
        scanner.close();
    }
    //printing city name
    public  void printcityName(String city){

        switch (city){
            case "A":
                System.out.println("Aberdeen");
                break;
            case "B":
                System.out.println("Belfast");
                break;
            case "c":
                System.out.println("Cambridge");
                break;
            case "D":
                System.out.println("Derby");
                break;
            case "E":
                System.out.println("Edinburgh");
                break;
            case "F":
                System.out.println("Feltham");
                break;
            default:
                System.out.println("this alpthabat is not in your city name A to F");
        }
    }
}