package WhileLoops;

/**
 * Created by Spencer on 1/16/2016.
 */
public class WhileLoops {
    public static void main(String[] args){
        printHellos();

        System.out.println(countOccurance("hello", "l"));

        System.out.println(divisibleBy345Original());

        System.out.println(divisibleBy345EarlyReturn());
        System.out.println(divisibleBy345Break());

        System.out.println(divisibleBy345Continue());

    }
    // print Hello World 42 times
    static void printHellos(){
        // start i at 0
        int i = 0;
        // while i is less than 42 we execute the loop
        while(i < 42){
            // print hello world
            System.out.println(i + " - Hello World");
            // increment i -> Very important to make the loop end
            i++;
        }
    }
    // counts the number of occurrences of the string c in string s
    static int countOccurance(String s, String c) {
        // initialize a count variable at 0 to store the number of occurrences
        int count = 0;
        // start with i at 0
        int i = 0;
        // execute the loop while i is less than the length of s
        while (i < s.length()) {
            // if the ith element of s is equal to c, increment count
            if (s.substring(i, i+1).equals(c)) {
                count++;
            }
            // increment i
            i++;
        }
        // return the final count
        return count;
    }

    // first version of a function that finds a number divisible by 3,4 and 5 between 1 and 100
    static int divisibleBy345Original() {
        // start i at 1
        int i = 1;
        // set result to -1, we return -1 if we do not find a number divisible by 3,4,5
        int result = -1;
        // execute the loop while i is less than or qual to 100
        while (i <= 100) {
            // if the number is divisible by 3,4,5 set result to i
            if (i % 3 == 0 && i % 4 == 0 && i % 5 == 0) {
                result = i;
            }
            // increment i
            i++;
        }
        // return the result
        return result;
    }
    // a version of divisibleBy345 that uses an early return
    static int divisibleBy345EarlyReturn() {
        int i = 1;
        int result = -1;
        // this loop will not end until we break it with a return
        while (true) {
            if (i % 3 == 0 && i % 4 == 0 && i % 5 == 0) {
                result = i;
                // break the loop and return as soon as we find the first number that is divisible by 3,4,5
                return result;
            }
            i++;
        }

    }
    // a version of divisibleBy345 that uses a break
    static int divisibleBy345Break() {
        int i = 1;
        int result = -1;
        // this loop will not end until we execute a break
        while (true) {
            if (i % 3 == 0 && i % 4 == 0 && i % 5 == 0) {
                result = i;
                // break as soon as we find a valid number
                break;
            }
            i++;
        }
        // return result after we execute the break
        return result;
    }
    static int divisibleBy345Continue() {
        int i = 1;
        int result = -1;
        // loop will not end until we execute the break
        while (true) {
            if (!(i % 3 == 0 && i % 4 == 0 && i % 5 == 0)) {
                i++;
                // go back to the start of the loop (the if statement)
                continue;
            } else {
                // we get here when the continue is not executed (the if statement fails), break the loop
                result = i;
                break;
            }
        }
        // return result after finishing the loop
        return result;
    }


}
