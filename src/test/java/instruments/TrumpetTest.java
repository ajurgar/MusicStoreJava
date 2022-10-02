package instruments;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TrumpetTest {

    Trumpet trumpet;

    @BeforeEach
    public void setUp(){
        trumpet = new Trumpet(90, 180, InstrumentTypes.BRASS, 3, "Trumpet");
    }

    @Test
    public void canPlayInstrument(){
        assertEquals("Toooot", trumpet.play());
    }
}
