import java.util.List;

public class Hobby {
    private String hobby;
    private int frequency;
    private String address;

    public Hobby(String hobby, int frequency, String address){
        this.hobby = hobby;
        this.frequency = frequency;
        this.address = address;
    }

    public void setHobby(String hobby){
        this.hobby = hobby;
    }

    public void setFrequency(int frequency){
        this.frequency = frequency;
    }

    public void setAddress(String address){
        this.address = address;
    }

    @Override
    public String toString() {
        return " Hobby: " + hobby + " Frequency: " + frequency + " Address: " + address;
    }
}
