package chapter17;

import java.io.FileOutputStream;

public class FileOutputStreamEx2 {
    public static void main(String[]args){

        try {
            FileOutputStream fos = new FileOutputStream("test.txt");

            byte[] b = new byte[26];
            byte data = 65;
            for (int i=0; i<b.length; i++){
                b[i] = data;
                data++;
            }
            fos.write(b);
       }
        catch (Exception e){
            System.out.println(e.getMessage());
        }



    }
}
