package items;

public class Picks extends Item {

    private String description;

    public Picks(double buyingPrice, double sellingPrice, String description) {
        super(buyingPrice, sellingPrice);
        this.description = description;
    }
}
