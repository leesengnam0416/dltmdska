package chapter09;

public interface MyInterface1 {
    default void defaultMethod(){
        System.out.println("MyInterface 의 default 메서드");
    }
    static void staticMethod(){
        System.out.println("MyInterface 의 static 메서드");
    }
}
