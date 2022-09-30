package instruments;

public class Guitar extends Instrument{

    private int strings;
    private String description;

    public Guitar(double buyingPrice, double sellingPrice, int strings) {
        super(buyingPrice, sellingPrice);
        this.strings = strings;
        this.description = "This is a guitar";
    }

    public int getStringsCount(){
        return this.strings;
    }

    public int getStrings() {
        return strings;
    }

    public String getDescription() {
        return description;
    }
}
