package booking_system;

import booking_system.IHotel;

import java.util.List;

public enum Hotel implements IHotel {
    SONATA {
        private final int stars = 4;
        @Override
        public int getStars() {
            return stars;
        }

        @Override
        public List<String> getFreeRooms() {
            return null;
        }

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

        @Override
        public List<String> getFreeRooms() {
            return null;
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

        @Override
        public List<String> getFreeRooms() {
            return null;
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

        @Override
        public List<String> getFreeRooms() {
            return null;
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

        @Override
        public List<String> getFreeRooms() {
            return null;
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

        @Override
        public List<String> getFreeRooms() {
            return null;
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

        @Override
        public List<String> getFreeRooms() {
            return null;
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

        @Override
        public List<String> getFreeRooms() {
            return null;
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

        @Override
        public List<String> getFreeRooms() {
            return null;
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

        @Override
        public List<String> getFreeRooms() {
            return null;
        }

        @Override
        public void bookRoom(String room) {

        }
    };

}
