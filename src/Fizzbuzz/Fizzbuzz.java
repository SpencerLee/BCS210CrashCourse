package Fizzbuzz;

/**
 * Created by Spencer on 1/16/2016.
 */
public class Fizzbuzz {
    public static void main(String[] args){
        fizzbuzz(3);
    }
    public static void fizzbuzz(int n) {
        for (int i = 1; i <= n; i++) {
            String output = "";
            if (i % 3 == 0) {
                output += "fizz";
            } else if (i % 5 == 0) {
                output += "buzz";
            } else {
                output = Integer.toString(i);
            }
            System.out.println(output);
        }
    }

}
