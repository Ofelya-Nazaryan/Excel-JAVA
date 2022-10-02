package MyExcelDemo;

public class DEMO {
    public static void main(String[] args) {


        for (Weekday wk1 : Weekday.values()) {
            System.out.println(Weekday.valueOf(wk1.toString()));
            System.out.println(wk1.isWeekDay());

        }

    }


}
