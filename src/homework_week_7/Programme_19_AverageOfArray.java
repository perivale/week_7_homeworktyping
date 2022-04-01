package homework_week_7;

import java.util.Arrays;
//write a java programme to calculate the average of array
public class Programme_19_AverageOfArray {
    public static void main(String[] args) {
        //numeric array declaration
        int[] numArray={
                1789,2035,1899,2040,1950,2255,7897,1455,787};
        int sum=0;
        //calculation the sums of array value
        for(int i=0; i< numArray.length;i++){
            sum=sum+numArray[i];
        }
        //finding the average of arrays value
        int average=sum/numArray.length;
        System.out.println("value of the array are"+ Arrays.toString(numArray));
        System.out.println("avarage of all the value of the array are;"+average);



    }

}
