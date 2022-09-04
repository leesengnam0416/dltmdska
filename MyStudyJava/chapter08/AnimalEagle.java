package chapter08;

public class AnimalEagle extends Animal{

    AnimalEagle(String type, String name) {
        super(type, name);
    }

    void sleep(){
        System.out.println(this.name+"은(는) 하늘서 잠을 잔다");
    }
}
