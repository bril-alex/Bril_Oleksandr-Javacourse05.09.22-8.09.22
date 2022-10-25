package Homework.Homework_19;

import java.util.Scanner;

import static Homework.Homework_19.DrinksPrice.*;

public class Drinkmaker {
    public void choiceDrink(){
        Scanner scanner = new Scanner(System.in);
        int item = 0;
        int summ = 0;
        boolean isRunning = true;
        while (isRunning){
            System.out.println("Welcome to Drink Menu!");
            System.out.println("Choose your drink");
            System.out.println("We have: " + "\n" + "COFFEE" + " " + "TEA" + "\n" + "LEMONADE"+ " " + "MOHITO" +
                    "\n" + "WATER" + " " + "COLA");
            System.out.println("If you want exit from menu - choose EXIT");
            String usersChoose = scanner.nextLine();
            DrinksMachine drinksMachine = DrinksMachine.valueOf(usersChoose.toUpperCase());
            switch (drinksMachine) {
                case TEA -> {
                    System.out.println("Tea is preparing " + TEA_PRICE + "$");
                    summ += TEA_PRICE;
                    item++;
                }
                case COLA -> {
                    System.out.println("Cola is poured " + COLA_PRICE + "$");
                    summ += COLA_PRICE;
                    item++;
                }
                case WATER -> {
                    System.out.println("Water is poured " + WATER_PRICE + "$");
                    summ += WATER_PRICE;
                    item++;
                }
                case COFFEE -> {
                    System.out.println("Coffee is cooking " + COFFEE_PRICE + "$");
                    summ += COFFEE_PRICE;
                    item++;
                }
                case MOHITO -> {
                    System.out.println("Mohito is preparing " + MOHITO_PRICE + "$");
                    summ += MOHITO_PRICE;
                    item++;
                }
                case LEMONADE -> {
                    System.out.println("Lemonade is preparing " + LEMONADE_PRICE + "$");
                    summ += LEMONADE_PRICE;
                    item++;
                }
                case EXIT -> {
                    System.out.println("You choosed " + item + " drink(s)");
                    System.out.println("Summ= " + summ + "$");
                    isRunning = false;
                }
            }
        }
    }
}
