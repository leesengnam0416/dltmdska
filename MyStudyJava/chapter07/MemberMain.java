package chapter07;

public class MemberMain
{
    public static void main(String[]args)
    {
        Member m = new Member();
        Member m1 = new Member();

        if (m == m1){
            System.out.println("m객체와 m1객체는 같다");
        } else{
            System.out.println("m캑체와 m1객체는 다르다");
        }
    }
}
