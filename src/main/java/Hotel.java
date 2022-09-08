import java.util.ArrayList;
import java.util.HashMap;

public class Hotel {

    private ArrayList<Bedroom> rooms;
    private ArrayList<ConferenceRoom> conferenceRooms;
    private HashMap<String, DiningRoom> diningHash;

    public Hotel(){
        this.conferenceRooms = new ArrayList<>();
        this.rooms = new ArrayList<>();
        this.diningHash = new HashMap<>();
    }

    public int getConferenceRooms(){
        return this.conferenceRooms.size();
    }

    public int getRooms(){
        return this.rooms.size();
    }

    public int getDiningRooms(){
        return this.diningHash.size();
    }

    public void addRoom(Bedroom bedroom){
        this.rooms.add(bedroom);
    }

    public void addConferenceRoom(ConferenceRoom conferenceRoom){
        this.conferenceRooms.add(conferenceRoom);
    }

    public Booking bookRoom(Bedroom bedroom, int nights){
        return new Booking(bedroom, nights);
    }

    public void addDiningRoomToHash(DiningRoom diningRoom){
        this.diningHash.put(diningRoom.getName(), diningRoom);
    }
}
