package booking_system;

public interface IHotel {
    int getStars();
    String getFreeRooms();
    String getTypeRooms();

    void bookRoom(String room);


}
