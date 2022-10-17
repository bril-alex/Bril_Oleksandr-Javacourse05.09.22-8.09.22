package Homework.Homework_17;

public class MainSmart {
    public static void main(String[] args) {
        Androids android = new Androids("Samsung", "S20", 11);
        android.deviceInfo();
        android.LinuxSystem();
        iPhones iPhones = new iPhones("XS", 15.2);
        iPhones.deviceInfo();
        iPhones.iOSuser();
    }
}
