package items;

import interfaces.ISell;

public class Item implements ISell {

    private double buyingPrice;
    private double sellingPrice;

    public Item(double buyingPrice, double sellingPrice) {
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
    }

    public double getBuyingPrice() {
        return buyingPrice;
    }
    public double getSellingPrice(){
        return this.sellingPrice;
    }

    @Override
    public double calculateMarkup() {
        return sellingPrice - buyingPrice;
    }
}
