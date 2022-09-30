
import instruments.Instrument;
import instruments.Trumpet;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class InstrumentsTest {
    Trumpet trumpet;

    @BeforeEach
    void setup(){
        trumpet = new Trumpet(100, 150, 3);

    }

    @Test
    void canPlaySounds(){
        assertEquals("Toot",trumpet.play());
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
