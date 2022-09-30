package instruments;

import interfaces.ISell;

public class Instrument implements ISell {

    private double buyingPrice;
    private double sellingPrice;

    public Instrument(double buyingPrice, double sellingPrice) {
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
    }

    public double getBuyingPrice() {
        return buyingPrice;
    }

    public double calculateMarkup() {
        return sellingPrice - buyingPrice;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }
}
