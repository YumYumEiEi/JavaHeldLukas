package OOP;

public class Radio {

    private boolean isOn;
    private int volume;
    private double frequency;
    private Modulation modulation = Modulation.AM;

    public Radio() {
    }

    public Radio( double frequency ) {
        setFrequency( frequency );
    }

    public Radio( String station ) {
        this( stationNameToFrequency( station ) );
    }

    public Radio (Radio radio){
        this.frequency = radio.frequency;
        this.modulation = radio.modulation;
        this.volume = radio.volume;
        this.isOn = radio.isOn;
    }

    private static double stationNameToFrequency( String station ) {
        return 0;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public double getFrequency() {
        return frequency;
    }

    public void setFrequency(double frequency) {
        this.frequency = frequency;
    }

    public Modulation getModulation() {
        return modulation;
    }

    public void setModulation(Modulation modulation) {
        this.modulation = modulation;
    }

    @Override
    public String toString() {
        return "Radio{" +
                "isOn=" + isOn +
                ", volume=" + volume +
                ", frequency=" + frequency +
                ", modulation=" + modulation +
                '}';
    }
}
