package Homework.Homework_10;

import java.util.Random;

public class Shatles {
    public static void main(String[] args) {
        Random random = new Random();
        int counter = 0;
        boolean isRunning = true;
        while (isRunning){
            int i = random.nextInt(250);
            String number = i + "";
            if (!number.contains("4") && !number.contains("9")&& !number.startsWith("0")) {
                counter++;
                System.out.println(number);
            }
            if (counter ==100){
                isRunning = false;
            }
        }

    }
}


