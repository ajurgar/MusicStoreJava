package instruments;

import interfaces.IPlay;
import interfaces.ISell;

public class Instrument implements ISell, IPlay {

    private double buyingPrice;
    private double sellingPrice;
    private InstrumentTypes type;

    public Instrument(double buyingPrice, double sellingPrice, InstrumentTypes type) {
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
        this.type = type;
    }



    public InstrumentTypes getType() {
        return type;
    }

    public double getBuyingPrice() {
        return buyingPrice;
    }


    public double getSellingPrice() {
        return sellingPrice;
    }

    public double calculateMarkup() {
        return sellingPrice - buyingPrice;
    }

    public String play(){
        return "Playing";
    }
}
