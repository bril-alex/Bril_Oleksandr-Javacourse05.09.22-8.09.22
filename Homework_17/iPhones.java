package Homework.Homework_17;

public class iPhones implements Smartphone, iOS{
    public String model;
    public double systemVersion;
    public final String systemType = "iOS";

    public iPhones(String model, double systemVersion) {
        this.model = model;
        this.systemVersion = systemVersion;
    }

    @Override
    public void iOSuser() {
        iOS.super.iOSuser();
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
        System.out.println("iOS: " +
                "model- " + model +
                ", systemVersion- " + systemType +
                " " + systemVersion);
    }
}
