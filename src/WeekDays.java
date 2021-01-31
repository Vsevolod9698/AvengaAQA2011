public enum WeekDays {
    MONDAY {
        @Override
        public WeekDays getNextDay() {

                return TUESDAY;
        }
    },
    TUESDAY {
        @Override
        public WeekDays getNextDay() {

                return WEDNESDAY;

        }
    },
    WEDNESDAY {
        @Override
        public WeekDays getNextDay() {
            return THURSDAY;
        }
    },
    THURSDAY {
        @Override
        public WeekDays getNextDay() {
            return FRIDAY;
        }
    },
    FRIDAY {
        @Override
        public WeekDays getNextDay() {
            return SATURDAY;
        }
    },
    SATURDAY {
        @Override
        public WeekDays getNextDay() {
            return SUNDAY;
        }
    },
    SUNDAY {
        @Override
        public WeekDays getNextDay() {
            return MONDAY;
        }
    };
    public abstract WeekDays getNextDay();


}
