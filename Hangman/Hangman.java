package Hangman;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Spencer Lee on 2016-01-06.
 * For the BCS CPSC 210 Crash Course
 */

/**
    Want more practice? Here are some ideas for extending this program:

    Keep track of how many attempts the user has made and provide them with a score.

    Limit the user to a certain number of guesses before they get a game over

    Come up with a way to track which letters have already been guessed and show it
    to the user when they make each guess


*/

public class Hangman {
    public static void main(String[] args) throws IOException {

        // prompt the user for a word
        String answer = getInput("Enter a word");

        // print a bunch of blank lines to hide the answer from the player
        String output = createOutput(answer);
        for(int i=0; i<20; i++){
            System.out.println("\n");
        }
        // Game loop: continue asking for guesses until the word is guessed
        while(output.contains("_")) {

            // prompt user for guess
            String currentGuess = getInput("Enter a guess for : " + output);

            // compute the current output
            output = checkGuess(currentGuess, answer, output);

            // print result of the guess
            System.out.println("User input: " + currentGuess + "     output: " + output);

            // loop back to guessing until word is answered
        }

        // once the word has been completely guessed print a message and end
        System.out.println("Congratulations you guessed the answer!");

    }

    // generic function to get a string input from the user. Prints a message with the prompt for input
    public static String getInput(String message){
        Scanner scan = new Scanner(System.in);
        System.out.println(message);
        String input = scan.next();
        return input;
    }
    // returns a string of "_"s that is the length of the input string
    public static String createOutput(String answer){
        String output = "";
        for(int i = 0; i<answer.length();i++) {
            output = output.concat("_");
        }
        return output;
    }
    // check if the guess character is anywhere in the answer string. If it is add it to the output string at the
    // appropriate location
    public static String checkGuess(String guess, String answer, String output){

        String newOutput = output;

        // checking if the guess is only one letter. If not we ask for a new guess and use that.
        // How else could we deal with guesses that are more than 1 character? What if the guess is not a letter at all?
        if(guess.length() > 1){
            System.out.println("Your guess is too long, please input only one letter");
            String newGuess = getInput("Enter a new guess");
            // recurse with the new guess
            return checkGuess(newGuess, answer, output);
        }
        // Now we know the guess is only 1 character
        else {
            // loop through every character in the answer
            for (int i = 0; i < answer.length(); i++) {
                // if the guessed letter and letter in the answer are the same add that letter to the output in that position
                if (guess.equals(answer.substring(i, i + 1))) {
                    newOutput = newOutput.substring(0,i) + guess + output.substring(i+1,output.length());
                }
            }
        }
        // return our new output with the guessed letter added to the right spot (if there are any)
        return newOutput;
    }

}
