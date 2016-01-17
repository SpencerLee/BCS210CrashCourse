package Arrays;

/**
 * Created by Spencer on 1/16/2016.
 */
public class Arrays {
    public static void main(String[] args){
        // create an array of integers to test the function with
        int[] arr = {1,2,-5,0,22,-34};
        // print the number of positive ints in arr
        System.out.println(countPositives(arr));
    }
    // Counts the number of positive integers in a given array of integers
    static int countPositives(int[] arr) {
        // initialize a variable to store our count, start at 0
        int count = 0;
        // iterate over all elements in arr and increment count when an element is positive
        for(int i = 0; i < arr.length; i++){
            if (arr[i] > 0){
                count++;
            }
        }
        // return count of positives
        return count;

    }
}
