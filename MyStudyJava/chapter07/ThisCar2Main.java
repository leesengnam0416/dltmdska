package chapter07;

public class ThisCar2Main {
    public static void main(String[]args){
        ThisCar2 c1 = new ThisCar2();
        ThisCar2 c2 = new ThisCar2("중형차");
        ThisCar2 c3 = new ThisCar2("현대","대형차");
        ThisCar2 c4 = new ThisCar2("black","기아","화물차");

        System.out.println("c1 = " +c1);
        System.out.println("c2 = " +c2);
        System.out.println("c3 = " +c3);
        System.out.println("c4 = " +c4);
    }
}
