package ForLoops;

/**
 * Created by Spencer on 1/16/2016.
 */
public class ForLoops {
    public static void main(String[] args){
        printEvens();
        System.out.println(countOccurrence("string", "a"));
        System.out.println(countOccurrence("world", "l"));
        System.out.println(countOccurrence("hello", "l"));
    }

    // prints all even numbers from 1 to 50
    public static void printEvens(){
        // iterate over numbers between 1 and 50
        for (int i = 1; i <= 50; i++){
            // check if i is divisible by 2
            if(i % 2 == 0){
                System.out.println(i);
            }

        }
    }
    // returns the number of times string c occurrs in string s
    static int countOccurrence(String s, String c){
        // initialize a count variable to store the number of occurrences
        int count = 0;
        // iterate over every letter in s
        for (int i = 0; i < s.length(); i++) {
            // check if the ith letter in s is equal to c
            if (s.substring(i, i+1).equals(c)) {
                // increment count
                count++;
            }
        }
        // return the final count
        return count;

    }
}
