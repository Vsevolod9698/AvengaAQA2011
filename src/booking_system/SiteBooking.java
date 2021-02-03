package booking_system;

import java.util.ArrayList;
import java.util.List;

public class SiteBooking implements ISearch {

    @Override
    public List<IHotel> search(int stars) {
        List<IHotel> suitableHotels= new ArrayList<>();
                for(IHotel hotel: Hotel.values()){
                       if (hotel.getStars()==stars){
                           suitableHotels.add(hotel);
                       }
                }
        return suitableHotels;
    }

    @Override
    public List<IHotel> searchByFreeRooms() {
        return null;
    }
    public static void main(String[] args) {
        SiteBooking siteBooking = new SiteBooking();
        System.out.println(siteBooking.search(4));
        System.out.println(siteBooking.search(5));
        System.out.println(siteBooking.search(3));
        System.out.println(siteBooking.search(2));
        System.out.println(siteBooking.search(1));

    }
}
