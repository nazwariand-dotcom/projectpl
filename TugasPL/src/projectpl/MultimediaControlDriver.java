package projectpl;

public class MultimediaControlDriver {
    public static void main(String[] args) {

        MultimediaControl audio = new AudioPlayer("iPod", "MP3");
        MultimediaControl movie = new MoviePlayer("Samsung TV", 
            new Screen("1080p", 60, 5), MonitorType.LED);

        System.out.println("=== TEST AUDIO PLAYER ===");
        audio.play();
        audio.stop();
        audio.previous();
        audio.next();

        System.out.println("\n=== TEST MOVIE PLAYER ===");
        movie.play();
        movie.stop();
        movie.previous();
        movie.next();
    }
}