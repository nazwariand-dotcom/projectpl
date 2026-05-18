package projectpl;

public class MoviePlayerDriver {
    public static void main(String[] args) {
        Screen screen = new Screen("720x480", 40, 22);
        MoviePlayer player = new MoviePlayer("DBPOWER MK101", screen, MonitorType.LCD);

        player.play();
        player.stop();
        player.previous();
        player.next();

        System.out.println(player);
    }
}
