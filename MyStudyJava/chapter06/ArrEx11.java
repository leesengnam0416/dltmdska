package chapter06;

public class ArrEx11
{
    public static void main(String[] args)
    {
        //원본 배열
        int[] arrInt1 = {1,2,3};
        //복사할 배열
        int[] arrInt2 = new int[5];

        System.arraycopy(arrInt1,0,arrInt2,2,arrInt1.length);

        // 배열 값 출력
        for (int i=0; i< arrInt2.length; i++)
        {
            System.out.println(arrInt2[i]);
        }

    }
}
