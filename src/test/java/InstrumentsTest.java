
import instruments.Instrument;
import instruments.InstrumentTypes;
import instruments.Trumpet;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class InstrumentsTest {
    Trumpet trumpet;

    @BeforeEach
    void setup(){
        trumpet = new Trumpet(90, 180, InstrumentTypes.BRASS, 3, "Trumpet");

    }

    @Test
    void canGetBuyingPrice(){
        assertEquals(90, trumpet.getBuyingPrice());
    }

    @Test
    void canPlaySounds(){
        assertEquals("Toooot",trumpet.play());
    }

    @Test
    void canCheckNumberOfValves(){
        assertEquals(3, trumpet.getValvesCount());
    }

    @Test
    void trumpetIsInstrument() {
        assertTrue(trumpet instanceof Instrument);
    }





}
