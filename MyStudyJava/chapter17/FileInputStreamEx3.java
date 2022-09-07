package chapter17;

import java.io.FileInputStream;

public class FileInputStreamEx3 {
    public static void main(String[]args){

        try {
            FileInputStream fis = new FileInputStream("src/chapter17/InputStreamEx.java");
            int data=0;
            byte[] buf = new byte[fis.available()];
            while ((data=fis.read(buf, 0,buf.length)) != -1){
                System.out.print (new String(buf,0,data));
            }
        } catch (Exception e){

        }




    }
}
