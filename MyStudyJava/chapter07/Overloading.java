package chapter07;

public class Overloading {
    public static void main(String[]args){
        Operator op = new Operator();

        System.out.println(op.multiply(4,3));
        System.out.println(op.multiply(4.5,3.5));
        System.out.println(op.multiply(4,3.5));
        System.out.println(op.multiply(4.5,3));

    }
}
