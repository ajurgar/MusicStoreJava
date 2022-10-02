package instruments;

public class Guitar extends Instrument{

    private int strings;
    private String description;
    private String sound;

    public Guitar(double buyingPrice, double sellingPrice, InstrumentTypes type, int strings, String description) {
        super(buyingPrice, sellingPrice, type);
        this.strings = strings;
        this.description = description;
        this.sound = "Piiii";
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

    public String play(){
        return sound;
    }


}
