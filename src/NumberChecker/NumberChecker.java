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
        if(x > 0) {
            System.out.println("POSITIVE");
        } else if (x < 0) {
            System.out.println("NEGATIVE");
        } else {
            System.out.println("ZERO");
        }
    }

}
