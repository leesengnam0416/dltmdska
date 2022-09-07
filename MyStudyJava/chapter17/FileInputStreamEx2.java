package chapter17;

import java.io.FileInputStream;

public class FileInputStreamEx2 {
    public static void main(String[]args){

        try {
            FileInputStream fis = new FileInputStream("src/chapter17/InputStreamEx.java");
            int data=0;
            byte[] buf = new byte[fis.available()];
            while ((data=fis.read()) != -1){
                System.out.print ((char) data);
            }
        } catch (Exception e){

        }




    }
}
