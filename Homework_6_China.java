package Homework;

public class Homework_6_China {
    public static void main (String[] args) {
        int warriorLi = 13;
        int archerLi = 24;
        int riderLi = 46;
        warriorLi *=860;
        archerLi *=860;
        riderLi *=860;
        int totalCapacityLi = (warriorLi + archerLi + riderLi);
        int warriorMin = 9;
        int archerMin = 35;
        int riderMin = 12;
        warriorMin*= (int)(860*1.5);
        archerMin*= (int)(860*1.5);
        riderMin*= (int)(860*1.5);
        int totalCapacityMin = (warriorMin + archerMin + riderMin);
        System.out.println("Dynasty Li:");
        System.out.println("Warrior  " + warriorLi);
        System.out.println("Archer  " + archerLi);
        System.out.println("Rider  " + riderLi);
        System.out.println("Dynasty Min:");
        System.out.println("Warrior  " + warriorMin);
        System.out.println("Archer  " + archerMin);
        System.out.println("Rider  " + riderMin);
        System.out.println("Total Capacity Dynasty Li =   " + totalCapacityLi);
        System.out.println("Total Capacity Dynasty Min =   " + totalCapacityMin);
        if (totalCapacityLi>totalCapacityMin){
            System.out.println("Dynasty Li Wins!");
        }
        else if (totalCapacityLi<totalCapacityMin) {
            System.out.println("Dynasty Min Wins!");
        }
    }
}
