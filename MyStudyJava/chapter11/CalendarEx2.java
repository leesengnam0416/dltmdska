package chapter11;

import java.util.Date;

public class CalendarEx2 {
    public static void main(String[]args){

        //현재일
        int sYear = 2022;
        int sMonth = 8;
        int sDay = 31;

        //이전일
        int eYear = 2022;
        int eMonth = 8;
        int eDay = 1;

        Date sd = new Date();
        Date ed = new Date();

        sd.setYear(sYear);
        sd.setMonth(sMonth-1);
        sd.setDate(sDay);

        ed.setYear(eYear);
        ed.setMonth(eMonth-1);
        ed.setDate(eDay);

        long temp = (sd.getTime() - ed.getTime()) / (1000L * 60L * 60L * 24L);
        int diff = (int)temp;

        System.out.println(diff + "일 경과");
    }
}
