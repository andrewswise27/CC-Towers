import java.util.ArrayList;

public abstract class Room {

    protected RoomType roomType;
    protected ArrayList<Guest> guests;

    public Room(RoomType roomType){
        this.roomType = roomType;
        this.guests = new ArrayList<>();
    }

    public RoomType getRoomType(){
        return this.roomType;
    }

    public int getNumOfGuests() {
        return this.guests.size();
    }





}
