package chapter11;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarEx3 {
    public static void main(String[]args){

        //현재일
        int sYear = 2022;
        int sMonth = 8;
        int sDay = 31;

        //이전일
        int eYear = 2022;
        int eMonth = 8;
        int eDay = 1;

//        Calendar sCal = Calendar.getInstance();
//        Calendar eCal = Calendar.getInstance();
//        sCal.set(sYear,sMonth+1,sDay);
//        eCal.set(eYear,eMonth+1,eDay);
        Calendar sCal = new GregorianCalendar(sYear,sMonth,sDay);
        Calendar eCal = new GregorianCalendar(eYear,eMonth,eDay);

        long diffSec = (sCal.getTimeInMillis()-eCal.getTimeInMillis())/1000;
        long diffDay = diffSec / (24*60*60);
        System.out.println(diffDay+"일 경과");
    }
}
