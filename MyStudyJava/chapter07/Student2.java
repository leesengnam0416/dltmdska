package chapter07;

public class Student2 {

    //필드
    String name; // 학생명
    int grade; // 학년
    String department; // 학과

    // 1번 생성자
    Student2() {

    }

    // 2번 생성자
    Student2(String n){
        name = n;
    }

    // 3번 생성자
    Student2(String n, int g){
        name = n;
        grade = g;
    }

    // 4번 생성자
    Student2(String n, int g, String d){
        name = n;
        grade = g;
        department = d;
    }

}
