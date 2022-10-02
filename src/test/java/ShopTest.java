import instruments.Guitar;
import instruments.Instrument;
import instruments.InstrumentTypes;
import instruments.Trumpet;
import interfaces.ISell;
import items.Item;
import items.Picks;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShopTest {

    Shop shop;
    Item item;
    Instrument instrument1;
    Instrument instrument2;
    Instrument instrument3;


    @BeforeEach
    void setUp() {
        shop = new Shop("theTrumpet");
        instrument1 = new Guitar(50, 100, InstrumentTypes.STRING, 6, "Guitar");
        instrument2 = new Guitar(50, 100, InstrumentTypes.STRING, 6, "Guitar");
        instrument3 = new Guitar(50, 100, InstrumentTypes.STRING, 6, "Guitar");

        item = new Picks(20, 50, "Pick");
    }

    @Test
    void hasName(){
        assertEquals("theTrumpet", shop.getName());
    }

    @Test
    void hasStock(){
        assertEquals(0,shop.getStock().size());
    }

    @Test
    void canStockUpInstruments() {
        Trumpet trumpet = new Trumpet(90, 180, InstrumentTypes.BRASS, 3, "Trumpet");
        shop.addItemToStock(trumpet);
        assertEquals(trumpet, shop.getStock().get(0));
    }

    @Test
    void canStockUpItems(){
        Picks picks = new Picks(15,18, "Pick");
        shop.addItemToStock(item);
        assertEquals(1, shop.getStock().size());
    }

//    @Test
//    void canOnlyAddSellableItemsToStock() {
//        String text = "This is a string";
//        shop.addItemToStock(text);
//        assertEquals( 0 , shop.getStock().size());
//    }

    @Test
    void canRemoveFromInventory(){
        shop.addItemToStock(item);
        shop.removeItem(item);
        assertEquals(0, shop.getStock().size());
    }

    @Test
    void canCalculateTotalProfit(){
        shop.addItemToStock(instrument1);
        shop.addItemToStock(instrument2);
        shop.addItemToStock(item);
        assertEquals(3, shop.getStock().size());
        assertEquals(130, shop.getPotentialProfits(), 0.0);

    }






}