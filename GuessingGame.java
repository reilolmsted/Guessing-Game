// Programmer : Reilly Olmsted (revamped)
// Class: CS &141
// Date: 02/13/2023
// Assignment: Lab4
// Guessing Game
// This program will produce a random number guessing game that the user can pay


import java.util.Scanner;
import java.util.Random;

public class GuessingGame {

    public static void main(String [] args) { // declares the integers and boolean as well as well as scanner input

        int totalGames = 0;
        int totalGuesses = 0;
        int bestGame = 1000;
        int guessesPerGame = 0;
        boolean continueGame = true;
        Scanner input = new Scanner(System.in);

        while(continueGame) {
            totalGames++;
            instructions();
            totalGuesses += playGame();
            System.out.println("Would you you want to play again? (y/n)");

            String userInput = input.next();

            if (userInput.equals("y")) {
                continueGame = true;
            } else if(userInput.equals("n")) {
                continueGame = false;

            } // end else if

        } // end while
        reportResults(totalGames, totalGuesses, bestGame); // calls reportResults at end of method
    } // end main

    public static void instructions() {
        System.out.println("I'm thinking of a number between 1 and 100");

    } // end instructions method

    public static int playGame() { // executes the guessing game
        Random randomObject = new Random();
        int goal = randomObject.nextInt(100) + 1;
        Scanner pooplol = new Scanner(System.in);
        System.out.println("Take your best guess!");
        int userGuess = pooplol.nextInt();
        int guesses = 0;

        while (userGuess != goal) {
            guesses++;
            if (userGuess < goal) {
                System.out.println("Higher");
                userGuess = pooplol.nextInt();
            } else if (userGuess > goal) {
                System.out.println("Lower");
                userGuess = pooplol.nextInt();
            } // end else if

        } // end while loop
        guesses++;
        System.out.print("Congratulations! You're an awesome guesser! ");
        return guesses;

    } // end playGame method

    public static void reportResults(int totalGames, int totalGuesses, int bestGame) { // executes and prints the results for the game
        double guessesPerGame = (double) totalGuesses / totalGames;
        System.out.println("Thanks for playing!");
        System.out.println("Total Games Played: " + totalGames);
        System.out.println("Total Guesses: " + totalGuesses);
        System.out.println("Guesses Per Game: " + guessesPerGame);

    } // end report results method

} // end class