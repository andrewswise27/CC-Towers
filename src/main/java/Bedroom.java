import java.util.ArrayList;

public class Bedroom extends Room {

    private int rmNum;
    private double nightlyRate;


    public Bedroom(RoomType roomType, int rmNum, double nightlyRate) {
        super(roomType);
        this.rmNum = rmNum;
        this.nightlyRate = nightlyRate;
        this.guests = new ArrayList<>();
    }

    public int getValueFromEnum(){
        return this.roomType.getValue();
    }

    public void addGuestToBedroom(Guest guest){
        this.guests.add(guest);
    }

    public void removeGuestFromBedroom(Guest guest){
        this.guests.remove(guest);
    }

    public double getNightlyRate() {
        return this.nightlyRate;
    }
}
