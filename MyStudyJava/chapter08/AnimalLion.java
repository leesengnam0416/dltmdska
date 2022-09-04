package chapter08;

public class AnimalLion extends Animal{

    AnimalLion(String type, String name) {
        super(type, name);
    }
    void sleep(){
        System.out.println(this.name+"은(는) 숲속에서 잠을 잔다");
    }
}
