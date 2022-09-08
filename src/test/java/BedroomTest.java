import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    Bedroom bedroom;

    @Before
    public void before(){
        bedroom = new Bedroom(RoomType.FAMILY, 25, 30.00);
    }

    @Test
    public void canGetRoomCapacity(){
        assertEquals(4, bedroom.getValueFromEnum());
    }

    @Test
    public void canGetRoomType(){
        assertEquals(RoomType.FAMILY, bedroom.getRoomType());
    }

    @Test
    public void canGetGuestsInRoom(){
        assertEquals(0, bedroom.getNumOfGuests());
    }
}
