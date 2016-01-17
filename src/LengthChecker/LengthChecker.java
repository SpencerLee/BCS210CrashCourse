package LengthChecker;

/**
 * Created by Spencer on 1/16/2016.
 */
public class LengthChecker {
    public static void main(String[] args) {
        lengthChecker("fiz");
        lengthChecker("fizzbuzz");
        lengthChecker("fizzbuzzfizz");
    }

    public static void lengthChecker(String s) {
        // if s is shorter than 4 letters we print the whole string
        if (s.length() < 4) {
            System.out.println(s);
        }
        // if s is between 4 and 8 letters print the first 4 letters then ...
        else if (s.length() >= 4 && s.length() <= 8) {
            System.out.println(s.substring(0, 4) + "...");
        }
        // otherwise print "String too long"
        else {
            System.out.println("String too long");
        }
    }
}

