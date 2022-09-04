package chapter08;

public class SupberEx2 {
}

class Parent2{
    String name;

    Parent2(String name){
        this.name = name;
    }
}

//class Child2 extends Parent2{
//    // 에러 발생
//}

class Child2 extends Parent2{
    Child2(String name){
        super(name);
    }
}