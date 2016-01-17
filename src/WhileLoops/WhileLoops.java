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

    static void printHellos(){
        int i = 0;
        while(i < 42){
            System.out.println(i + " - Hello World");
            i++;
        }
    }

    static int countOccurance(String s, String c) {
        int count = 0;
        int i = 0;
        while (i < s.length()) {
            if (s.substring(i, i+1).equals(c)) {
                count++;
            }
            i++;
        }
        return count;
    }

    static int divisibleBy345Original() {
        int i = 1;
        int result = -1;
        while (i <= 100) {
            if (i % 3 == 0 && i % 4 == 0 && i % 5 == 0) {
                result = i;
            }
            i++;
        }
        return result;
    }

    static int divisibleBy345EarlyReturn() {
        int i = 1;
        int result = -1;
        while (true) {
            if (i % 3 == 0 && i % 4 == 0 && i % 5 == 0) {
                result = i;
                return result;
            }
            i++;
        }

    }

    static int divisibleBy345Break() {
        int i = 1;
        int result = -1;
        while (true) {
            if (i % 3 == 0 && i % 4 == 0 && i % 5 == 0) {
                result = i;
                break;
            }
            i++;
        }
        return result;
    }
    static int divisibleBy345Continue() {
        int i = 1;
        int result = -1;
        while (true) {
            if (!(i % 3 == 0 && i % 4 == 0 && i % 5 == 0)) {
                i++;
                continue;
            } else {
                result = i;
                break;
            }
        }
        return result;
    }


}
