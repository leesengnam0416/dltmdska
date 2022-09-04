package chapter02;

public class HelloJava
{
    public static void main(String[] args)
    {
        System.out.println("Hello Java");

        // IntelliJ 에서 줄 바꿈 하고 싶을때는
        // Alt + Shift 누르고 방향키

        // 주석
        /* 주석 */

        int a; // 변수 선언
        a = 10 ; // 변수 초기화
        // int : 정수형

        int b = 10; // 변수 선언과 초기화 동시에

        /*
        *  1. 클래스 명은 첫자를 대문자로
        *  - String , Math....
        *  - 변수나 메서드는 첫자를 소문자로
        *  2. 여러 단어로 이루어진 경우 두번째 이후 대문자
        *  - parseInt , studentNumber.....
        *  - 변수는 단어 사이에 ' _ ' 추가 (student_number)
        *  3. 상수 (변하지 않는 수)는 모두 대문자로
        *  - PI , MAX_NUMBER...
        */

        // 자료형은 데이터 타입 (Data Type)
        // 자료형은 크게 기본자료형 , 참조 자료형 으로 나눠진다.
    }
}
