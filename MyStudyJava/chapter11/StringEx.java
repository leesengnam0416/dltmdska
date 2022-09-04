package chapter11;

public class StringEx {
    public static void main (String[]args){
        int score = 90;
        System.out.println("당신의 점수는"+score+ "입니다.");

//        String s = score; // 데이터 타입이 달라 에러
        String s = String.valueOf(score); // String 으로 형 변환

        //문자열을 + 연산하여 String으로 형변환
        String s2 = score + "";
    }
}
