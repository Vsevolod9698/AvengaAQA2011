package booking_system;

public interface IHotel {
    int getStars();
    String getFreeRooms();
    String getTypeRooms();
    String getSettlement();

    void bookRoom(String room);


}
