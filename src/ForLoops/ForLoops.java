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

    public static void printEvens(){
        for (int i = 1; i <= 50; i++){
            if(i % 2 == 0){
                System.out.println(i);
            }

        }
    }

    static int countOccurrence(String s, String c){
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.substring(i, i+1).equals(c)) {
                count++;
            }
        }
        return count;

    }
}
