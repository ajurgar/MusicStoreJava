package instruments;

import interfaces.ISell;

public class Trumpet extends Instrument implements ISell {

    private int valves;
    private String description;

    public Trumpet(double buyingPrice, double sellingPrice, int valves) {
        super(buyingPrice, sellingPrice);
        this.valves = valves;
        this.description = "this is a trumpet";
    }

    public String play(){
        return "Toot";
    }

    public int getValvesCount(){
        return this.valves;
    }

    public String getDescription() {
        return description;
    }
}
