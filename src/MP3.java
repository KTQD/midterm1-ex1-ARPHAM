import java.time.Duration;

public class MP3 extends Item{
    private Duration duration;
    MP3(String name, String description, String iD, float price) {
        super(name, description, iD, price);
    }
}
