package booking_system;

import java.awt.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
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
        System.out.println(stars);
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
        System.out.println(room);
        return freeRoom;
    }

    @Override
    public ArrayList<Hotel> searchByTypeOFRooms(String type) {
        ArrayList<Hotel> typeRoom = new ArrayList<>();

        for (IHotel hotel: Hotel.values()){
            if (hotel.getTypeRooms()==type){
                typeRoom.add((Hotel) hotel);
            }

        }
        Collections.sort(typeRoom);
        System.out.println(type);
        return typeRoom;



    }

    @Override
    public List<Hotel> searchByTimeSettlement(String time) {
        ArrayList<Hotel> timeSettlement = new ArrayList<>();
        for (IHotel hotel: Hotel.values()){
            if (hotel.getSettlement()==time){
                timeSettlement.add((Hotel) hotel);
            }

        }

        LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter fff = DateTimeFormatter.ofPattern("dd MMMM, YYYY");
        System.out.println(fff.format(localDateTime));
        System.out.println(fff.format(localDateTime.plusWeeks(1)));
        return timeSettlement;
    }







    public static void main(String[] args) {
        SiteBooking timeSettlement = new SiteBooking();
        System.out.println("Час заселення і виселення");
        System.out.println(timeSettlement.searchByTimeSettlement("dd MMMM, YYYY"));




//        LocalDateTime localDateTime = LocalDateTime.now();
//        System.out.println(localDateTime);
//        DateTimeFormatter fff = DateTimeFormatter.ofPattern("dd MMMM, YYYY");
//        System.out.println(fff.format(localDateTime));
//        ArrayList<String> type = new ArrayList<String>();
//        type.add("Apartments");
//        type.add("Luxury");
//        type.add("Semi-luxury");
//        type.add("Standard");
//        Collections.sort(type);
//        System.out.println("List after the use of" +
//                " Collection.sort() :\n" + type);
        SiteBooking typeRoom = new SiteBooking();
        System.out.println("Клас номера готелю");
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
//                    System.out.println(comfort);?
//                }
        SiteBooking freeRoom = new SiteBooking();
        System.out.println("Пошук вільних кімнат");
        System.out.println(freeRoom.searchByFreeRooms("Free"));


        SiteBooking siteBooking = new SiteBooking();
        System.out.println("Скільки зірок в готелю");
        System.out.println(siteBooking.search(5));
        System.out.println(siteBooking.search(4));
        System.out.println(siteBooking.search(3));
        System.out.println(siteBooking.search(2));
        System.out.println(siteBooking.search(1));



    }


    }

