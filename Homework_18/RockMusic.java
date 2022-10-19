package Homework.Homework_18;

public class RockMusic extends MusicStyles{
    public String groupName;

    public RockMusic(String groupName) {
        this.groupName = groupName;
    }

    @Override
    public void playMusic() {
        System.out.println(groupName + " is Rock Music performer");
    }
}
