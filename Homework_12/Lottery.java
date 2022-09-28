package Homework.Homework_12;

import java.util.Arrays;
import java.util.Random;

public class Lottery {
    public static void main(String[] args) {
        Random random = new Random();
        int[] organizator = new int[7];
        System.out.print("Organizator numbers: ");
        int i;
        for (i = 0; i < organizator.length; i++) {
            organizator[i] = random.nextInt(9);
            System.out.print(organizator[i] + " ");
        }
        System.out.println();
        System.out.print("Human numbers: ");
        int[] human = new int[7];
        int a;
        for (a = 0; a < human.length; a++) {
            human[a] = random.nextInt(9);
            System.out.print(human[a] + " ");
        }
        System.out.println();
        System.out.print("Organizator sorted numbers: ");
        Arrays.sort(organizator);
        System.out.print(Arrays.toString(organizator) + " ");
        System.out.println();
        System.out.print("Human sorted numbers: ");
        Arrays.sort(human);
        System.out.print(Arrays.toString(human) + " ");
        System.out.println();
        System.out.print("Numbers that are matched: ");
        int counter = 0;
        for (a = 0; a < human.length; a++) {
            if (organizator[a] == human[a]){
                System.out.print(human[a] + " ");
                counter++;
            }
        }
        System.out.println();
        System.out.println("Count of matched numbers: " + counter );
    }
}


