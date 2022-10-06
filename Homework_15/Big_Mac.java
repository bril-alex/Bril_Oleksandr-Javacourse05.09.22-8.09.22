package Homework.Homework_15;

public class Big_Mac extends Classic_burger{
    public String meat1;

    public Big_Mac(String bun, String meat, String cheese, String greens, String mayonnaise, String meat1) {
        super(bun, meat, cheese, greens, mayonnaise);
        this.meat1 = meat;
    }

    @Override
    public void getBurgercomposition() {
        System.out.printf("Big Mac composition: "
                + " \n" + bun
                + " \n" + meat
                + " \n" + meat1
                + " \n" + cheese
                + " \n" + greens
                + " \n" + mayonnaise);
    }
}
