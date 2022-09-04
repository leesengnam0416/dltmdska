package chapter05;

public class Excercise1
{
    public static void main(String[] args)
    {
        int sum=0;
        // for문을 이용하여 반복 합계 연산
        for (int i=0; i<=100; i++)
        {
            sum += i;
            i+=4;
        }
        System.out.println("5의 배수의 합계는 :" +sum);

    }
}
