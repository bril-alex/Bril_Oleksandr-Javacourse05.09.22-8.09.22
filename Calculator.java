package Homework;
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        System.out.println("Enter your first number and press the Enter button");
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        System.out.println("Enter your second number and press the Enter button");
        int secondNumber = scanner.nextInt();
        int resultSum = firstNumber + secondNumber;
        System.out.println("Sum of your numbers= " + resultSum);
    }
}