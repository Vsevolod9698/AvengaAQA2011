package booking_system;

public enum Hotel implements IHotel {
    SONATA {
        private final int stars = 4;
        @Override
        public int getStars() {
            return stars;
        }
        private final String rooms = "Free";
        @Override
        public String getFreeRooms() {
            return rooms;
        }
        private final String typeOfRooms = "Apartments";
        @Override
        public String getTypeRooms() { return typeOfRooms; }

        @Override
        public void bookRoom(String room) {

        }
    },
    SYHIV {
        private final int stars = 5;
        @Override
        public int getStars() {
            return stars;
        }
        private final String rooms = "Free";
        @Override
        public String getFreeRooms() {
            return rooms;
        }
        private final String typeOfRooms = "Standard";
        @Override
        public String getTypeRooms() {
            return typeOfRooms;
        }

        @Override
        public void bookRoom(String room) {

        }
    },
    LEMBERG {
        private final int stars = 3;
        @Override
        public int getStars() {
            return stars;
        }
        private final String rooms = "Free";
        @Override
        public String getFreeRooms() {
            return rooms;
        }
        private final String typeOfRooms = "Luxury";
        @Override
        public String getTypeRooms() {
            return typeOfRooms;
        }

        @Override
        public void bookRoom(String room) {

        }
    },
    OMELA {
        private final int stars = 4;
        @Override
        public int getStars() {
            return stars;
        }
        private final String rooms = "Free";
        @Override
        public String getFreeRooms() {
            return rooms;
        }
        private final String typeOfRooms = "Apartments";
        @Override
        public String getTypeRooms() {
            return typeOfRooms;
        }

        @Override
        public void bookRoom(String room) {

        }
    },
    CARLEONE {
        private final int stars = 2;
        @Override
        public int getStars() {
            return stars;
        }
        private final String rooms = "Free";
        @Override
        public String getFreeRooms() {
            return rooms;
        }
        private final String typeOfRooms = "Semi-luxury";
        @Override
        public String getTypeRooms() {
            return typeOfRooms;
        }

        @Override
        public void bookRoom(String room) {

        }
    },
    LONDON {
        private final int stars = 1;
        @Override
        public int getStars() {
            return stars;
        }
        private final String rooms = "Free";

        @Override
        public String getFreeRooms() {
            return rooms;
        }
        private final String typeOfRooms = "Apartments";
        @Override
        public String getTypeRooms() {
            return typeOfRooms;
        }

        @Override
        public void bookRoom(String room) {

        }
    },
    MEMORIA {
        private final int stars = 4;
        @Override
        public int getStars() {
            return stars;
        }
        private final String rooms = "Free";

        @Override
        public String getFreeRooms() {
            return rooms;
        }
        private final String typeOfRooms = "Luxury";
        @Override
        public String getTypeRooms() {
            return typeOfRooms;
        }

        @Override
        public void bookRoom(String room) {

        }
    },
    CARLOS {
        private final int stars = 3;
        @Override
        public int getStars() {
            return stars;
        }
        private final String rooms = "Free";

        @Override
        public String getFreeRooms() {
            return rooms;
        }
        private final String typeOfRooms = "Standard";
        @Override
        public String getTypeRooms() {
            return typeOfRooms;
        }

        @Override
        public void bookRoom(String room) {

        }
    },
    MONTANA {
        private final int stars = 5;
        @Override
        public int getStars() {
            return stars;
        }
        private final String rooms = "Free";

        @Override
        public String getFreeRooms() {
            return rooms;
        }
        private final String typeOfRooms = "Semi-luxury";
        @Override
        public String getTypeRooms() {
            return typeOfRooms;
        }

        @Override
        public void bookRoom(String room) {

        }
    },
    FERRERO {
        private final int stars = 2;
        @Override
        public int getStars() {
            return stars;
        }
        private final String rooms = "Free";

        @Override
        public String getFreeRooms() {
            return rooms;
        }
        private final String typeOfRooms = "Semi-luxury";
        @Override
        public String getTypeRooms() {
            return typeOfRooms;
        }

        @Override
        public void bookRoom(String room) {

        }
    };

}
