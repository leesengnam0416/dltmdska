package chapter08.poly;

public class PloyEx {
    public static void main(String[]args){
        Child c = new Child();

        c.run();
        // 부모 클래스의 자료형으로 선언 (자동형 변환)
        Parent p = new Child();
        p.run(); // 재정의된 메서드가 실행
        // p.eat(); // 에러
    }
}
