package booking_system;

import booking_system.IHotel;

import java.util.List;

public interface ISearch {
    List<IHotel> search(int stars);
    List<IHotel> searchByFreeRooms( );
}
