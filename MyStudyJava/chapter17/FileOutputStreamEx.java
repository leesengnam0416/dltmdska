package chapter17;

import java.io.FileOutputStream;

public class FileOutputStreamEx {
    public static void main(String[]args){

        try {
            FileOutputStream fos = new FileOutputStream("test.txt");
            fos.write(65);
            fos.write(66);
            fos.write(67);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }



    }
}
