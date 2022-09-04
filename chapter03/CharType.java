package chapter03;

import java.util.Random;

public class CharType
{
    public static void main (String[] args)
    {
        char a = 'A';

        System.out.println("a:"+a);

        int b = a;
        System.out.println("b:"+b);

        int c = 66;
        System.out.println("c:"+c);

        int d = a+b; // 65 + 65
        System.out.println("d:"+d);

        // char c = 'Hello' ; // 에러 , char 함수는 한글자만 가능

    }
}
