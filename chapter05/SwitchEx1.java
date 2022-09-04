package chapter05;

import java.util.Scanner;

public class SwitchEx1
{
    public static void main(String[] args)
    {
        System.out.println("점수를 입력 하세요 :");
        Scanner sc = new Scanner(System.in);

        int score = sc.nextInt();
        String grade = "";
        switch(score/ 10)
        {
            case 9:
                grade = "A";
            case 8:
                grade = "B";
            case 7:
                grade = "C";
            case 6:
                grade = "D";
            default :
                grade = "F";
        }
        System.out.println("학점 : " +grade);
    }
}
