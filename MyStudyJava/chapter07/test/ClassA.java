package chapter07.test;
// 접근 제한자
public class ClassA {
    public static void main(String[] args) {
        ClassB cb = new ClassB();
        cb.print();
    }


    public void print() {
        System.out.println("여기는 Class A");
    }
}
// default
class ClassB {
    void print(){
        System.out.println("여기는 ClassB");
    }
}