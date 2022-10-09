package Homework.Homework_16;

import java.util.Scanner;

public class Fitness_tracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Fitness tracker!");
        Person_data person = new Person_data("Anzhela", "Sydorenko", 1995, "sydorenko@gmail.com",
                "0932654718", 55, 120,10000);
        person.printAccountInfo();
        System.out.println("Change you daily steps");
        person.setSteps(scanner.nextInt());
        person.printAccountInfo();
        scanner.nextLine();
        System.out.println();

        Person_data person1 = new Person_data("Olga", "Petryk", 1985, "olga27@gmail.com",
                "0993564718", 67, 125,12000);
        person1.printAccountInfo();
        System.out.println("Change you Last name");
        person1.setLname(scanner.nextLine());
        person1.printAccountInfo();
        scanner.nextLine();
        System.out.println();

        Person_data person2 = new Person_data("Oleg", "Semenov", 1965, "Sem_sem65@gmail.com",
                "0952073344", 90, 130,8000);
        person2.printAccountInfo();
        System.out.println("Change you weight");
        person2.setWeight(scanner.nextInt());
        person2.printAccountInfo();

        Person_data person3 = new Person_data("Nick", "Lysuk", 1997, "NickLys@gmail.com",
                "0673951865", 89, 120,15000);
        person3.printAccountInfo();
    }
}
