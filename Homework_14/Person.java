package Homework.Homework_14;

public class Person {
    public String name_Sname;
    public String city;
    public long phone;

    public Person(String name_Sname, String city, long phone) {
        this.name_Sname = name_Sname;
        this.city = city;
        this.phone = phone;
    }
    public void personInfo() {
        System.out.println("Call to person " + name_Sname +
                " from the " + city +" city " +
                " by the phone number: " + phone);
    }
}


