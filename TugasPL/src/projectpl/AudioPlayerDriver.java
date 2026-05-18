package projectpl;

public class AudioPlayerDriver {
     public static void main(String[] args) {
        AudioPlayer player = new AudioPlayer("iPod Mini", "15 MP3 | 1 AAC");

        player.play();
        player.stop();
        player.previous();
        player.next();

        System.out.println(player);
    }
}
