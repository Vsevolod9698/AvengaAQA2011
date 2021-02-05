package booking_system;

import java.util.List;

public interface ISearch {
    List<IHotel> search(int stars);
    List<IHotel> searchByFreeRooms(String rooms);
    List<Hotel> searchByTypeOFRooms(String type);
}
