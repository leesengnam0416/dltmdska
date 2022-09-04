package chapter10;

public class Outer {
    interface interfaceEx{
        void method();
    }
    interfaceEx ie;

    void setInterfaceEx(interfaceEx ie){
        this.ie = ie;
    }

    void outerMethod(){
        ie.method();
    }
}
