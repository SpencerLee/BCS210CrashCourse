package Fizzbuzz;

/**
 * Created by Spencer on 1/16/2016.
 */
public class Fizzbuzz {
    public static void main(String[] args){
        fizzbuzz(3);
        fizzbuzzAlt(3);
    }
    // iterates over numbers from 1 to n, print "fizz" if number is divisible by 3, "buzz" if number is divisible by "5"
    // and "fizzbuzz" if number is divisible by 15
    public static void fizzbuzz(int n) {
        // iterate over all numbers in the range
        for (int i = 1; i <= n; i++) {
            // blank output string
            String output = "";
            // if the number is divisible by 3 we add "fizz"
            if (i % 3 == 0) {
                output += "fizz";
            // if the number is divisible by 5 we add "buzz"
            } else if (i % 5 == 0) {
                output += "buzz";
            } else {
                // if the number is divisible by neither 3 nor 5 we return the number in string form
                output = Integer.toString(i);
            }
            // print the output
            System.out.println(output);
        }
    }

    // an alternate version of fizzbuzz that explicitly checks if the number is divisible by 15
    public static void fizzbuzzAlt(int n){
        for(int i = 1; i <= n; i++){
            if(i % 15 == 0){
                System.out.println("fizzbuzz");
            }
            else if(i % 5 == 0){
                System.out.println("buzz");
            }
            else if(i % 3 == 0){
                System.out.println("fizz");
            }
            else{
                System.out.println(i);
            }
        }
    }

}
