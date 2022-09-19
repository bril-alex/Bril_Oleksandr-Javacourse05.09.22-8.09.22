package Homework;

import java.util.Random;
import java.util.Scanner;

public class Randomaizer {
    public static void main(String[] args) {
        Scanner consoleScanner = new Scanner(System.in);
        Random consoleRandom = new Random();
        System.out.println("Enter any number from 0 till 6");
        int randomNumber = consoleRandom.nextInt(6);
        int enteredNumber = consoleScanner.nextInt();
        if (randomNumber == enteredNumber){
            System.out.println("You cache it, hidden number is " + randomNumber);
        }
        else if (randomNumber < enteredNumber) {
            System.out.println("You are loser, hidden number - " + randomNumber);
        }
        else if (randomNumber > enteredNumber) {
            System.out.println("You are loser, hidden number - " + randomNumber);
        }
    }
}
