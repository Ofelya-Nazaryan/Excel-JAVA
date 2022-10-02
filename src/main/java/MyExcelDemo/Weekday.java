package MyExcelDemo;

public enum Weekday {

    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THRUSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;


    public boolean isWeekDay() {


        switch (this) {
            case MONDAY -> {
                return true;
            }
            case TUESDAY -> {
                return true;
            }
            case WEDNESDAY -> {
                return true;
            }

            case THRUSDAY -> {
                return true;
            }

            case FRIDAY -> {
                return true;
            }

        }
        return false;

    }


    public boolean isHoliday() {

        switch (this) {
            case SATURDAY -> {
                return true;
            }
            case SUNDAY -> {
                return true;
            }
        }
        return false;
    }
}



