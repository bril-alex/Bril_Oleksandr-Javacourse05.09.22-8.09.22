package Homework.Homework_13;

import java.util.Random;
import java.util.Scanner;

public class Matrix_transpose {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your first value and tap the 'Enter' button");
        int x = scanner.nextInt();
        System.out.println("Enter your second number and tap the 'Enter' button");
        int y = scanner.nextInt();
        int[][] first = new int[x][y];
        Random random = new Random();
        System.out.println("Your original matrix numbers: ");
        for (int a = 0; a < first.length; a++) {
            for (int b = 0; b < first.length; b++) {
                first[a][b] = random.nextInt(9) + 1;
                System.out.printf("%2d",first[a][b]);
            }
            System.out.println();
        }
        System.out.println("Your transpose matrix numbers: ");
        int[][] second = new int[y][x];
        for (int a = 0; a < first.length; a++) {
            for (int b = 0; b < first.length; b++) {
                second[b][a] = first[a][b];
            }
        }
            for (int a = 0; a < first.length; a++) {
                for (int b = 0; b < first.length; b++) {
                    System.out.printf("%2d",second[a][b]);
                }
                System.out.println();
            }
    }
}

