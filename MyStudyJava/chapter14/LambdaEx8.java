package chapter14;

import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;

public class LambdaEx8 {
    static Student[] list = {
        new Student("홍길동",90,80,"컴공"),
        new Student("이순신",95,70,"통계")
    };
    public static void main(String[]args){
        System.out.print("학생명 : ");
        printString(t->t.getName());
        System.out.print("전공 : ");
        printString(t->t.getMajor());
        System.out.print("영어 점수 : ");
        printInt(t->t.getEng());
        System.out.print("수학 점수 : ");
        printInt(t->t.getMath());
        System.out.print("영어 점수 합계 : ");
        printTot(t->t.getEng());
        System.out.print("수학 점수 합계 : ");
        printTot(t->t.getMath());
        System.out.print("영어 점수 평균 : ");
        printAvg(t->t.getEng());
        System.out.print("수학 점수 평균 : ");
        printAvg(t->t.getMath());

    }
    static void printAvg(ToDoubleFunction<Student>f){
        double sum = 0;
        for (Student s : list){
            sum += f.applyAsDouble(s);
        }
        System.out.println(sum / list.length);
    }
    static void printTot(ToIntFunction<Student> f){
        int sum = 0;
        for (Student s : list){
            sum += f.applyAsInt(s);
        }
        System.out.println(sum);
    }
    static void printInt(Function<Student,Integer> f){
        for (Student s : list){
            System.out.print(f.apply(s)+" ");
        }
        System.out.println();
    }
    static void printString(Function<Student,String> f){
        for (Student s : list){
            System.out.print(f.apply(s)+" ");
        }
        System.out.println();
    }

}

class Student {
    private String name;
    private int eng;
    private int math;
    private String major;

    public Student (String name,int eng,int math,String major){
        this.name = name;
        this.eng = eng;
        this.math = math;
        this.major = major;
    }
    public String getName(){
        return name;
    }
    public int getEng(){
        return eng;
    }
    public int getMath(){
        return math;
    }
    public String getMajor(){
        return major;
    }
}

