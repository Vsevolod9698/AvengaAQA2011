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
    public List<IHotel> searchByFreeRooms(String room) {
        List<IHotel> freeRoom = new ArrayList<>();
        for (IHotel hotel: Hotel.values()){
            if (hotel.getFreeRooms()==room){
                freeRoom.add(hotel);
            }
        }
        return freeRoom;
    }

    @Override
    public List<Hotel> searchByTypeOFRooms(String type) {
        List<Hotel> typeRoom = new ArrayList<>();
        for (IHotel hotel: Hotel.values()){
            if (hotel.getTypeRooms()==type){
                typeRoom.add((Hotel) hotel);
            }
        }
        return typeRoom;
    }





    public static void main(String[] args) {
        SiteBooking typeRoom = new SiteBooking();
        System.out.println(typeRoom.searchByTypeOFRooms("Apartments"));
        System.out.println(typeRoom.searchByTypeOFRooms("Luxury"));
        System.out.println(typeRoom.searchByTypeOFRooms("Semi-luxury"));
        System.out.println(typeRoom.searchByTypeOFRooms("Standard"));
//        String[] comfortable = new String[4];
//                comfortable[0] = "Standard";
//                comfortable[1] = "Semi-luxury";
//                comfortable[2] = "Luxury";
//                comfortable[3] = "Apartments";
//                for (String comfort: comfortable){
//                    System.out.println(comfort);
//                }
        SiteBooking freeRoom = new SiteBooking();
        System.out.println(freeRoom.searchByFreeRooms("Free"));


        SiteBooking siteBooking = new SiteBooking();
        System.out.println(siteBooking.search(4));
        System.out.println(siteBooking.search(5));
        System.out.println(siteBooking.search(3));
        System.out.println(siteBooking.search(2));
        System.out.println(siteBooking.search(1));



    }


    }

