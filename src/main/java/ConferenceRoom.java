import java.util.ArrayList;

public class ConferenceRoom extends Room{

    private String rmName;

    public ConferenceRoom(RoomType roomType, String rmName) {
        super(roomType);
        this.rmName = rmName;
        this.guests = new ArrayList<>();
    }

    public int getValueFromEnum(){
        return this.roomType.getValue();
    }

    public void addGuestToConferenceRoom(Guest guest){
        this.guests.add(guest);
    }

    public void removeGuestFromConferenceRoom(Guest guest){
        this.guests.remove(guest);
    }



}
