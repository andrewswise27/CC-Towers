import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    Hotel hotel;
    ConferenceRoom conferenceRoom;
    Bedroom bedroom;
    Guest guest;
    Guest guest2;
    DiningRoom diningRoom;

    @Before
    public void before(){
        bedroom = new Bedroom(RoomType.SINGLE, 25, 30.00);
        conferenceRoom = new ConferenceRoom(RoomType.CONFERENCE, "Johnson");
        guest = new Guest("John");
        guest2 = new Guest("Johnson");
        diningRoom = new DiningRoom("Johnathon", 12);
        hotel = new Hotel();
        hotel.addConferenceRoom(conferenceRoom);
        hotel.addRoom(bedroom);
        bedroom.addGuestToBedroom(guest);
        conferenceRoom.addGuestToConferenceRoom(guest);
    }

    @Test
    public void canAddRooms(){
        assertEquals(1, hotel.getRooms());
    }

    @Test
    public void canAddConferenceRooms(){
        assertEquals(1, hotel.getConferenceRooms());
    }

    @Test
    public void canAddGuestToRoom(){
        bedroom.addGuestToBedroom(guest2);
        assertEquals(2, bedroom.getNumOfGuests());
    }

    @Test
    public void canAddGuestToConferenceRoom(){
        conferenceRoom.addGuestToConferenceRoom(guest2);
        assertEquals(2, conferenceRoom.getNumOfGuests());
    }

    @Test
    public void canRemoveGuestFromRoom(){
        bedroom.removeGuestFromBedroom(guest);
        assertEquals(0, bedroom.getNumOfGuests());
    }

    @Test
    public void canRemoveGuestFromConferenceRoom(){
        conferenceRoom.removeGuestFromConferenceRoom(guest);
        assertEquals(0, conferenceRoom.getNumOfGuests());
    }

    @Test
    public void canReturnBooking(){
        Booking booking = hotel.bookRoom(bedroom, 10);
        assertEquals(10, booking.getNightsBooked());
    }

    @Test
    public void canAddDiningRoomToHash(){
        hotel.addDiningRoomToHash(diningRoom);
        assertEquals(1, hotel.getDiningRooms());
    }



}
