package chapter07;

public class MethodEx {
    void one() {
        two();
        System.out.println("one");
    }
    void two(){
        three();
        System.out.println("two");
    }
    void three(){
        System.out.println("three");
    }
}
