package Homework.Homework_15;

public class Classic_burger extends Diet_burger{
    public String mayonnaise;

    public Classic_burger(String bun, String meat, String cheese, String greens, String mayonnaise) {
        super(bun, meat, cheese, greens);
        this.mayonnaise = mayonnaise;
    }

    @Override
    public void getBurgercomposition() {
        System.out.print("Classic burger composition: "
                + " \n" + bun
                + " \n" + meat
                + " \n" + cheese
                + " \n" + greens
                + " \n" + mayonnaise);
    }
}
