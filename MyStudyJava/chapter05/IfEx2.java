package chapter05;

public class IfEx2
{
    public static void main(String[] args){
        int score = 80;
        String grade = "";

        System.out.println("학점 부여 시작");
        if (score >= 95){
            grade = "A+";
        } else if (score >= 90) {
            grade = "A";
        }
        else
        {
            grade = "F";
        }
        System.out.println("당신의 학점은"+grade+"입니다");
        System.out.println("학점 부여 끝");
    }
}
