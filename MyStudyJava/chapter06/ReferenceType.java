package chapter06;

public class ReferenceType
{
    public static void main(String[]args)
    {
        String name1 = "홍길동";
        String name2 = "홍길동";

        System.out.println(name1 == name2);

        //========= 위에는 같은 주소 값
        //밑에는 다른 주소값 ==============

        String name3 = new String("홍길동");
        String name4 = new String("홍길동");

        System.out.println(name3 == name4);
//        System.out.println(name3.equals(name4));
    }

}
