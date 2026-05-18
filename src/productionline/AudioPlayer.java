package productionline;

/**
 * Step 5 - AudioPlayer class
 * Concrete class for audio player products.
 * Extends Product and implements MultimediaControl.
 */
public class AudioPlayer extends Product implements MultimediaControl {

    private String audioSpecification;
    private ItemType mediaType;

    public AudioPlayer(String name, String audioSpecification) {
        super(name);
        this.audioSpecification = audioSpecification;
        this.mediaType = ItemType.Audio;
    }

    @Override
    public void play() {
        System.out.println("Playing");
    }

    @Override
    public void stop() {
        System.out.println("Stopping");
    }

    @Override
    public void previous() {
        System.out.println("Previous");
    }

    @Override
    public void next() {
        System.out.println("Next");
    }

    @Override
    public String toString() {
        return super.toString() + "\n"
             + "Audio Spec    : " + audioSpecification + "\n"
             + "Type          : " + mediaType;
    }
}
