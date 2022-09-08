import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    ConferenceRoom conferenceRoom;

    @Before
    public void before(){
        conferenceRoom = new ConferenceRoom(RoomType.CONFERENCE,"Johnson");
    }

    @Test
    public void canGetRoomCapacity(){
        assertEquals(10, conferenceRoom.getValueFromEnum());
    }

    @Test
    public void canGetRoomType(){
        assertEquals(RoomType.CONFERENCE, conferenceRoom.getRoomType());
    }

    @Test
    public void canGetGuestsInRoom(){
        assertEquals(0, conferenceRoom.getNumOfGuests());
    }
}
