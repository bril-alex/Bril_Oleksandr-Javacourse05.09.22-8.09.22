package Homework;

public class Counter_Strike {
    public static void main(String[] args) {
        String team1 = "Busters";
        int player1b = 420;
        int player2b = 560;
        int player3b = 720;
        int player4b = 815;
        int player5b = 650;
        int teamAverage1b = (player1b + player2b + player3b + player4b + player5b)/5;
        String team2 = "Adventures";
        int player1ad = 670;
        int player2ad = 815;
        int player3ad = 770;
        int player4ad = 650;
        int player5ad = 710;
        int teamAverage2ad = (player1ad + player2ad + player3ad + player4ad + player5ad)/5;
        if (teamAverage1b > teamAverage2ad) {
            System.out.println("The winner is  " + team1 + "and result is  " + teamAverage1b);
        }
        else if (teamAverage1b<teamAverage2ad) {
            System.out.println("The winner is  " + team2 + "and result is  " + teamAverage2ad);
        }
        else if (teamAverage1b == teamAverage2ad) {
            System.out.println("The winner is friendship, teams result is " + teamAverage2ad);
        }
    }
}
