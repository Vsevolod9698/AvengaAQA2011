package booking_system;

import java.util.List;

public interface IHotel {
    int getStars();
    List<String> getFreeRooms();
    void bookRoom(String room);


}
