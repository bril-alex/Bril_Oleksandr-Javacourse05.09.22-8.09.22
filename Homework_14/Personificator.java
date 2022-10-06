package Homework.Homework_14;

import java.util.Scanner;

public class Personificator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name and surname");
        String name_Sname = scanner.nextLine();
        System.out.println("Enter your city");
        String city = scanner.nextLine();
        System.out.println("Enter your phone number");
        long phone = scanner.nextLong();
        System.out.println();
        scanner.nextLine();

        System.out.println("Enter your name and surname");
        String name_Sname1 = scanner.nextLine();
        System.out.println("Enter your city");
        String city1 = scanner.nextLine();
        System.out.println("Enter your phone number");
        long phone1 = scanner.nextLong();
        System.out.println();
        scanner.nextLine();

        System.out.println("Enter your name and surname");
        String name_Sname2 = scanner.nextLine();
        System.out.println("Enter your city");
        String city2 = scanner.nextLine();
        System.out.println("Enter your phone number");
        long phone2 = scanner.nextLong();
        Person person = new Person(name_Sname,city,phone);
        Person person1 = new Person(name_Sname1,city1,phone1);
        Person person2 = new Person(name_Sname2,city2,phone2);
        person.personInfo();
        person1.personInfo();
        person2.personInfo();
    }
}
