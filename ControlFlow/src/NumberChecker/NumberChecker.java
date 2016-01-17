package NumberChecker;

/**
 * Created by Spencer on 1/16/2016.
 */
public class NumberChecker {
    public static void main(String[] args){
        numberChecker(5);
        numberChecker(0);
        numberChecker(-22);
        numberChecker(6+4);

    }

    public static void numberChecker(int x) {
        // if x is greater than 0 print "POSITIVE"
        if(x > 0) {
            System.out.println("POSITIVE");
        }
        // if x is less than zero print "NEGATIVE"
        else if (x < 0) {
            System.out.println("NEGATIVE");
        }
        // otherwise x must be zero so print "ZERO"
        else {
            System.out.println("ZERO");
        }
    }

}
