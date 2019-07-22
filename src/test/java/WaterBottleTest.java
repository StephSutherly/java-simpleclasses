import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    private WaterBottle waterBottle;

    @Before
    public void before() {
        waterBottle = new WaterBottle(100);
    }

    @Test
    public void has100ToBegin() {
        assertEquals(100, waterBottle.getVolume());
    }

    @Test
    public void loses10WhenDrinkCalled() {
        assertEquals(90, waterBottle.drink());
    }

    @Test
    public void emptyWhenEmptyCalled() {
        assertEquals(0, waterBottle.empty());
    }

    @Test
    public void fullWhenFillUpCalled() {
        WaterBottle almostEmpty = new WaterBottle(20);
        assertEquals(100, almostEmpty.fillUp());
    }
}
