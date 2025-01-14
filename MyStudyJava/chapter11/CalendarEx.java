package chapter11;

import java.util.Calendar;

public class CalendarEx {
    public static void main(String[]args){

        Calendar today = Calendar.getInstance();

        System.out.println("올해 년도 :"+today.get(Calendar.YEAR));
        System.out.println("이번달 : "+(today.get(Calendar.MONTH)+1));
        System.out.println("년도 기준 몇째주 :"+today.get(Calendar.WEEK_OF_YEAR));
        System.out.println("월기준 몇째주 :"+today.get(Calendar.WEEK_OF_MONTH));
        System.out.println("일자 : "+today.get(Calendar.DATE));
        System.out.println("일자 :"+today.get(Calendar.DAY_OF_MONTH));
        System.out.println("년도기준 날짜 :"+today.get(Calendar.DAY_OF_YEAR));
        System.out.println("요일 (일:1)~(토:7) :"+today.get(Calendar.DAY_OF_WEEK));
        System.out.println("월 기준 몇째 요일 :"+today.get(Calendar.DAY_OF_WEEK_IN_MONTH));
    }
}
