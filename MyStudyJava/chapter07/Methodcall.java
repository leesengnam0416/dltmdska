package chapter07;

public class Methodcall {
    public static void main(String[] args){
        //직접 실행
        Method.printName();

        //객체를 생성해서 실행
        Method m = new Method();
        m.printEmail();
    }
}
