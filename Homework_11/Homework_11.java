package Homework.Homework_11;

import java.util.Random;

public class Homework_11 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] first_team = new int[25];
        int sum_1=0;
        int average_1=0;
        for (int i = 0; i < first_team.length; i++) {
            first_team[i] = random.nextInt(22) + 18;
            sum_1+= first_team[i];
            average_1 = sum_1/ first_team.length;
            System.out.print(first_team[i] + " ");
        }
        System.out.println();
        int[] second_team = new int[25];
        int sum_2=0;
        int average_2=0;
        for (int a = 0; a < second_team.length; a++) {
            second_team[a] = random.nextInt(22) + 18;
            sum_2+= second_team[a];
            average_2 = sum_2/ second_team.length;
            System.out.print(second_team[a] + " " );
        }
        System.out.println();
        System.out.println("Sum of age first-team = " + sum_1);
        System.out.println("Sum of age second-team = " + sum_2);
        System.out.println("Average age of the first team is " + average_1);
        System.out.println("Average age of the second team is " + average_2);
    }
}
