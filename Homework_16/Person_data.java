package Homework.Homework_16;

public class Person_data {
    private final String fname;
    private String lname;
    private final int date;
    private final String email;
    private final String phone;
    private int weight;
    private int pressure;
    private int steps;
    private final int current_year = 2022;
    private int currentAge;
    public Person_data(String fname, String lname, int date, String email, String phone, int weight, int pressure, int steps) {
        this.fname = fname;
        this.lname = lname;
        this.date = date;
        this.email = email;
        this.phone = phone;
        this.weight = weight;
        this.pressure = pressure;
        this.steps = steps;
    }
    public void setLname(String lname) {
        this.lname = lname;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
    public void setSteps(int steps) {
        this.steps = steps;
    }
    public int getCurrentAge() {
        currentAge = current_year - date;
        return currentAge;
    }
    public void printAccountInfo(){
        System.out.println( fname + "\n" + lname + "\n" + getCurrentAge() + "\n" + email + "\n" + phone + "\n"
        + weight + "\n" + pressure + "\n" + steps);
    }
}
