package chapter17;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStreamEx {
    public static void main(String[]args){

        try{
            FileOutputStream fos = new FileOutputStream("print.text",true);
            PrintStream ps = new PrintStream(fos);
            ps.println("홍길동");
            ps.println(1111);
            ps.println(true);
            ps.println(3.14);
            ps.flush();
            ps.close();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }



    }
}
