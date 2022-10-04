package Homework.Homework_15;

public class Burger_menu {
    public static void main(String[] args) {
        var classic_burger = new Classic_burger("bun","meat","cheese"
                ,"greens", "mayonnaise");
        classic_burger.getBurgercomposition();
        System.out.println();
        var diet_burger = new Diet_burger("bun","meat","cheese","greens");
        diet_burger.getBurgercomposition();
        System.out.println();
        Big_Mac big_mac = new Big_Mac("bun","meat", "cheese",
                "greens","mayonnaise","meat");
        big_mac.getBurgercomposition();
    }
}
