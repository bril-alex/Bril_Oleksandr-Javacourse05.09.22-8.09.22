package Homework.Homework_18;

import java.util.Arrays;
import java.util.List;

public class MainMusic {
    public static void main(String[] args) {
     PopMusic popMusic = new PopMusic("Adele");
     RockMusic rockMusic = new RockMusic("Queen");
     ClassicMusic classicMusic = new ClassicMusic("London Symphony Orchestra");

       List <MusicStyles> genres = Arrays.asList(popMusic,rockMusic,classicMusic);
       for (MusicStyles g : genres){
           g.playMusic();
       }
    }
}
