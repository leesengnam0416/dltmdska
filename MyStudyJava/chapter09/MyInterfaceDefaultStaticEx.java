package chapter09;

public class MyInterfaceDefaultStaticEx {
    public static void main(String[]args){
        MyInterfaceChild c = new MyInterfaceChild();
        c.defaultMethod();
        c.method2();

        MyInterface1.staticMethod();
        Myinterface2.staticMethod();
    }
}
