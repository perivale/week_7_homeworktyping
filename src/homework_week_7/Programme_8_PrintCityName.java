package homework_week_7;
import java.util.Scanner;

/**
 * Input any alphabet from “A to “F” and print their city name accordingly (use if else) if
 * any other alphabet should be invalid entry
 */
public class Programme_8_PrintCityName {
    public static void main(String[] args) {
        //scanerr declaration for reading input from console
        Scanner scanner =new Scanner(System.in);
        System.out.println("please enter alpthabet between A to F;;");
        char city =scanner.next().charAt(0) ;
        //object creation
        Programme_8_PrintCityName cityName = new Programme_8_PrintCityName();
        cityName.PrintCityName(city);
        //closing the scaneer object
        scanner.close();
    }

    //printing city name
    public void PrintCityName(char City){
        if(City=='A' || City =='a') {
            System.out.println("Aberdeen");
        }else if(City=='B'|| City =='b'){
            System.out.println("Belfast");
        }else if(City=='C'|| City =='c'){
            System.out.println("Cambridge");
    }else if(City=='D'|| City =='d'){
            System.out.println("Derby");
}else if(City=='E'|| City =='e') {
            System.out.println("Edinburgh");
        }else if(City=='F'|| City =='f') {
            System.out.println("Feltham");
        }  }}