package chapter11;

public class StringEx4 {
    public static void main(String[]args){

        String text = "Hello My name is Lee Seung Nam";

        System.out.println("0번 인덱스 : "+text.charAt(0));

        for (int i=0; i<text.length(); i++){
            System.out.println(text.charAt(i));
        }
    }
}
