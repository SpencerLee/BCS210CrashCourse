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
        if (s.length() < 4) {
            System.out.println(s);
        } else if (s.length() >= 4 && s.length() <= 8) {
            System.out.println(s.substring(0, 4) + "...");
        } else {
            System.out.println("String too long");
        }
    }
}

