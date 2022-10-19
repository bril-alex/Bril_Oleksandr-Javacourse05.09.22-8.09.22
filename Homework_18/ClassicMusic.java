package Homework.Homework_18;

public class ClassicMusic extends MusicStyles{
    public String groupName;

    public ClassicMusic(String groupName) {
        this.groupName = groupName;
    }

    @Override
    public void playMusic() {
        System.out.println(groupName + " is Classic Music performer");
    }
}
