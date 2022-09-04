package chapter07;

public class Return2 {
    void getTest(int type){
        System.out.println("getTest() 메서드 시작");

        if (type == 1){
            return;
        }
        System.out.println("getTest() 메서드 끝");
    }

    String getname (int type){
        if (type == 1){
            return "";
        }
        return "홍길동";
    }
}
