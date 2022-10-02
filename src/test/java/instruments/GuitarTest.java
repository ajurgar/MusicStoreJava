package instruments;

import interfaces.ISell;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class GuitarTest {

    Guitar guitar;
    Trumpet trumpet;

    @BeforeEach
    void setUp(){
        guitar = new Guitar(100, 150 , InstrumentTypes.STRING,  6, "Guitar");
        trumpet = new Trumpet(90, 180, InstrumentTypes.BRASS, 3, "Trumpet");
    }

    @Test
    void hasStrings(){
        assertEquals(6, guitar.getStringsCount());
    }

    @Test
    void instrumentsHavePrices(){
        Instrument guitar = new Guitar(100, 150 , InstrumentTypes.STRING,  6, "Guitar");
        assertEquals(100, guitar.getBuyingPrice());
        assertEquals(150, guitar.getSellingPrice());
        assertEquals(90, trumpet.getBuyingPrice());
        assertEquals(180, trumpet.getSellingPrice());
    }

    @Test
    void canCalculateMarkup(){
        assertEquals(50.00, guitar.calculateMarkup());
    }

    @Test
    void guitarIsISell() {
        ISell newGuitar = guitar;
        assertTrue(newGuitar instanceof ISell);
    }
    @Test
    void instrumentHasDescription() {
        assertEquals("Guitar", guitar.getDescription());
        assertEquals("Trumpet", trumpet.getDescription());
    }


    @Test
    public void canPlayInstrument(){
        assertEquals("Piiii", guitar.play());
    }



}
