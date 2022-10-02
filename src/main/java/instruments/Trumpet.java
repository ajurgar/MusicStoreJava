package instruments;

import interfaces.ISell;

public class Trumpet extends Instrument {

    private int valves;
    private String description;
    private String sound;

    public Trumpet(double buyingPrice, double sellingPrice, InstrumentTypes type, int valves, String description) {
        super(buyingPrice, sellingPrice, type);
        this.valves = valves;
        this.description = description;
        this.sound = "Toooot";
    }

    public int getValvesCount(){
        return this.valves;
    }

    public String getDescription() {
        return description;
    }

    public String play() {
        return sound;
    }
}
