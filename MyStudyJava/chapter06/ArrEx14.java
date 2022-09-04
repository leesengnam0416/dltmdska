package chapter06;

public class ArrEx14
{
    public static void main(String[]args)
    {
        //배열 선언
        String[] news = {"홍길동","이순신","김유신"};
        int[] scores = {90,80,70};

        int i=0; //인덱스 변수
        for (String name:news){
            System.out.println(name+":"+scores[i]);
            i++;
        }
    }
}
