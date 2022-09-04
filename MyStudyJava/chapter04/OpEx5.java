package chapter04;

public class OpEx5
{
    public static void main(String[] args)
    {
        int a = 10;
        int b = 5;

        //AND 연산
        System.out.println(a > b && a == 10); // true
        System.out.println(a > b && a == b); // false

        //OR 연산
        System.out.println(a > b || a == b); //ture
        System.out.println(a < b || a == b); //false

        //XOR 연산
        System.out.println(a > b ^ a == 10); // false
        System.out.println(a > b ^ a == b); // ture

        // NOT 연산
        System.out.println( !(a > b)); // flase
        System.out.println( !(a < b)); // ture
    }
}
