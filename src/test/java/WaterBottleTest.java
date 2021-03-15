import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    WaterBottle waterbottle;

    @Before
    public void before(){
        waterbottle = new WaterBottle();
    }

    @Test
    public void hasVolume(){
        assertEquals(100, waterbottle.getVolume());
    }

    @Test
    public void checkDrinkReducesVolume(){
        assertEquals(90, waterbottle.drink());
    }

    @Test
    public void checkEmptySetsZeroVolume(){
        assertEquals(0, waterbottle.empty());
    }

    @Test
    public void checkFillSets100Volume(){
        waterbottle.drink();
        waterbottle.drink();
        assertEquals(100, waterbottle.fill());
    }
}
