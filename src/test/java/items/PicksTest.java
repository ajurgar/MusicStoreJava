package items;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PicksTest {

    Item pick = new Picks(10,15, "Pick");



    @Test
    void hasBuyingPrice() {
        assertEquals(10, pick.getBuyingPrice());
    }


    @Test
    void hasSellingPrice(){
        assertEquals(15, pick.getSellingPrice());
    }

    @Test
    void canCalculateMarkup(){
        assertEquals(5, pick.calculateMarkup());
    }
}