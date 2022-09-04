package chapter05;

public class Excercise6
{
    public static void main(String[]args)
    {
        // 줄 반복
        for(int i=0; i<4; i++){

            // 공백 출력
            for(int j=0; j < 3-i; j++){
                System.out.print(" ");
            }
            // 별 출력
            for(int j=0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            // 줄바꿈
            System.out.println();
        }

    }
}
