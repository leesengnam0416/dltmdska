package chapter07;

public class ParamEx
{
    public static void main(String[]args)
    {
        Param p = new Param();
        p.add(10,5);
        // p.add ("10","5"); // 에러

        p.add2(10,5);
        p.add3(1,2,3,4,5,6,7,8,9,10);
    }
}
