package homework_week_7;

import java.util.Arrays;
//write a programme to sum of array

public class Programme_18_SumOfArray {
    public static void main(String[] args) {
        //numbric array declaration
        int[] numArray = {
                1789, 2035, 1899, 2040, 1950, 2255, 7897, 1455, 787};
        int sum = 0;
        {
            //calulating of the sum os array value suing the loop
            for (int i = 0; i < numArray.length; i++) {
                {
                    sum = sum + numArray[i];
                    {
                        System.out.println("value of the elemwnt of the array are" + Arrays.toString(numArray));
                    }
                    System.out.println(("sum of all te value of the array are;" + sum));
                }
            }
        }
    }
}