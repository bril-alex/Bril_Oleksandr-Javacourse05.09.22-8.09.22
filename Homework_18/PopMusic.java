package Homework.Homework_18;

public class PopMusic extends MusicStyles{
    public String groupName;

    public PopMusic(String groupName) {
        this.groupName = groupName;
    }

    @Override
    public void playMusic() {
        System.out.println(groupName + " is Pop Music performer");
    }
}
