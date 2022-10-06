package Homework.Homework_15;

public class Diet_burger {
    public String bun;
    public String meat;
    public String cheese;
    public String greens;

    public Diet_burger(String bun, String meat, String cheese, String greens) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greens = greens;
    }

    public void getBurgercomposition(){
        System.out.print("Diet burger composition: "
                + " \n" + this.bun
                + " \n" + this.meat
                + " \n" + this.cheese
                + " \n" + this.greens);
    }
}
