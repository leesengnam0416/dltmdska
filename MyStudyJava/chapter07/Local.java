package chapter07;

public class Local
{
    String name;

    void process(){
        name = "홍길동";
    }

    void printAge1 (){
        int age = 20; //지역 변수
        System.out.println(age);
    }

    void printage2(){
        int age = 30; // 지역변수
        System.out.println(age);
    }
}
