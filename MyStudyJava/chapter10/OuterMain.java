package chapter10;

public class OuterMain {
    public static void main(String[]args){
        Outer out =new Outer();

        out.setInterfaceEx(new OuterInterfaceEximple());
        out.outerMethod();
        out.setInterfaceEx(new OuterInterfaceEximple2());
        out.outerMethod();
    }
}
