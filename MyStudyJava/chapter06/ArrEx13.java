package chapter06;

public class ArrEx13
{
    public static void main(String[]args)
    {
        //배열
        int[] arr= {1,2,3,4,5};

        //기존 for문을 이용한 출력;
        for (int i=0; i< arr.length; i++)
        {
            System.out.println(arr[i]);
        }
        // 향상된 for문 을 이용한 출력
        for (int number : arr){
            System.out.println(number);
        }
    }
}
