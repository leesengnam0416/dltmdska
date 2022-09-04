package chapter11;

public class WrapperEx {
    public static void main(String[]args){
        String number = "100";

        int i1 = Integer.parseInt(number);
        int i2 = new Integer(number).intValue();
        int i3 = Integer.parseInt(number);

        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);
    }
}
