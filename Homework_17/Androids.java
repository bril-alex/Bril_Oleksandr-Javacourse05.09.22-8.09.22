package Homework.Homework_17;

public class Androids implements Smartphone, LinuxOS {
    public String brand;
    public String model;
    public int systemVersion;
    public final String systemType = "Android";

    public Androids(String brand, String model, int systemVersion) {
        this.brand = brand;
        this.model = model;
        this.systemVersion = systemVersion;
    }

    @Override
    public void LinuxSystem() {
        LinuxOS.super.LinuxSystem();
    }

    @Override
    public void call() {

    }

    @Override
    public void sms() {

    }

    @Override
    public void internet() {

    }
    public void deviceInfo(){
        System.out.println("Android: " +
                "brand- " + brand  +
                ", model- " + model +
                ", systemVersion- " + systemType +
                " " + systemVersion);
    }
}
