package chapter05;

public class ForEx1
{
    public static void main(String[] args)
    {
        int sum = 0;

        for (int i=1; i<=100; i++)
        {
//            i = i + 3;
            sum += i;
        }
        System.out.println("합계:"+sum);
    }
}
