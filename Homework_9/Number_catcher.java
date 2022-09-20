package Homework.Homework_9;

import java.util.Random;
import java.util.Scanner;

public class Number_catcher {
        public static void main(String[] args) {
            Scanner consoleScanner = new Scanner(System.in);
            Random consoleRandom = new Random();
            System.out.println("Enter any number from 0 till 9");
            int counter = 1;
            while (counter <= 5){
                counter++;
                int randomNumber = consoleRandom.nextInt(9);
                int enteredNumber = consoleScanner.nextInt();
            if (randomNumber < enteredNumber) {
                System.out.println("You are loser, hidden number - " + randomNumber
                + "  Please try again");
            }
            else if (randomNumber > enteredNumber) {
                System.out.println("You are loser, hidden number - " + randomNumber
                        + "  Please try again");
            }
            else if (randomNumber == enteredNumber) {
                System.out.println("You cache it, hidden number is " + randomNumber);
                break;
            }
            }
        }
}

