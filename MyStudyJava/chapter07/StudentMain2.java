package chapter07;

public class StudentMain2 {
    public static void main(String[]args){
        Student2 stu1 = new Student2(); // 1번 생성자
        Student2 stu2 = new Student2("홍길동"); // 2번 생성자
        Student2 stu3 = new Student2("홍길동",4); // 3번 생성자
        Student2 stu4 = new Student2("홍길동",4,"소프트웨어공학"); // 4번 생성자
    }
}
