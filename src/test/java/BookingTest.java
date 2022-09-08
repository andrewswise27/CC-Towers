import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookingTest {

    Booking booking;
    Bedroom bedroom;

    @Before
    public void before(){
        bedroom = new Bedroom(RoomType.SINGLE, 10, 30.00);
        booking = new Booking(bedroom, 10);
    }

    @Test
    public void canReturnTotalBill(){
        assertEquals(300.00, booking.getTotalBill(), 0.00);
    }
}
