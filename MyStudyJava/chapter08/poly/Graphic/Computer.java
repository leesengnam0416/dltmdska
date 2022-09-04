package chapter08.poly.Graphic;

public class Computer {
    public static void main(String[]args){
        GraphicCard gc = new GraphicCard();
        gc.process(); // 원래 그래픽 카드 process

        gc = new Amd();
        gc.process();

        gc = new Nvidia();
        gc.process();
    }
}
