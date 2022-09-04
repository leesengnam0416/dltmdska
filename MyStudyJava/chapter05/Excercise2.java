package chapter05;

public class Excercise2
{
    public static void main(String[]args)
    {
        int evenSum = 0;
        int oddSUm = 0;

        for (int i=1; i<=100; i++)
        {
//            i+=1;
//            evenSum +=i;
//
//            i+=2;
//            oddSUm +=i;

            if (i % 2 ==0){
                evenSum += i;
            }
            else {
                oddSUm += i;
            }
        }
        System.out.println("짝수의 합계는 " +evenSum);
        System.out.println("홀수의 합계는 " +oddSUm);
    }
}
