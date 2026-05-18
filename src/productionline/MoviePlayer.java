package productionline;

/**
 * Step 11 - MoviePlayer class
 * Extends Product and implements MultimediaControl.
 * Has screen and monitor type fields.
 */
public class MoviePlayer extends Product implements MultimediaControl {

    private Screen screen;
    private MonitorType monitorType;

    public MoviePlayer(String name, Screen screen, MonitorType monitorType) {
        super(name);
        this.screen = screen;
        this.monitorType = monitorType;
    }

    @Override
    public void play() {
        System.out.println("Playing movie");
    }

    @Override
    public void stop() {
        System.out.println("Stopping movie");
    }

    @Override
    public void previous() {
        System.out.println("Previous chapter");
    }

    @Override
    public void next() {
        System.out.println("Next chapter");
    }

    @Override
    public String toString() {
        return super.toString() + "\n"
             + "Monitor Type  : " + monitorType + "\n"
             + screen;
    }
}
