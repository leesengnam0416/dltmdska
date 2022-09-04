package chapter11;

import java.util.Random;

public class RaodomEx2 {
    public static void main(String[]args){
        Random rand = new Random();

        for (int i=0; i<5; i++){
            System.out.println(rand.nextInt(6)+1);
        }
    }
}
