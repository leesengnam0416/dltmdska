package chapter08;

public class AnimalShark extends Animal{

    AnimalShark(String type, String name) {
        super(type, name);
    }
    void sleep(){
        System.out.println(this.name+"은(는) 물속에서 잠을 잔다");
    }
}
