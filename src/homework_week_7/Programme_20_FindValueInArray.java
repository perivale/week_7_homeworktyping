package homework_week_7;
//wirte a java programme to test if an array contain a spicific
public class Programme_20_FindValueInArray {
    //this method will find the vlaue if array contians value or not?
    public static boolean isArrayContains(int[] arr,int item) {
  boolean isContain=false;
    for(int i=0; i< arr.length;i++)
    if (arr[i] == item) {
        isContain = true;
        break;
    }

    return isContain;
}
public static void main(String[] args) {
    //declaring the numbric array
        int[]numArray={1789,2035,1899,2040,1950,2255,7897,1455};
        System.out.println(isArrayContains(numArray,2035));
        System.out.println(isArrayContains(numArray,7899));

}}