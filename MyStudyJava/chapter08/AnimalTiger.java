package chapter08;

public class AnimalTiger extends Animal {

    AnimalTiger(String type, String name) {
        super(type, name);
    }

    void sleep() {
        System.out.println(this.name + "은(는) 산속에서 잠을 잔다");
    }
}
