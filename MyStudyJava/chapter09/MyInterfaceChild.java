package chapter09;

public class MyInterfaceChild extends MyInterfaceParent implements MyInterface1,Myinterface2{
    @Override
    public void defaultMethod() {
        System.out.println("Child 클래스의 default 메서드");
        MyInterface1.super.defaultMethod();
        Myinterface2.super.defaultMethod();
    }
}
