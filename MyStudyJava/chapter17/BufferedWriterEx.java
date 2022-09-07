package chapter17;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class BufferedWriterEx {
    public static void main(String[]args){

        try {
            FileWriter fw = new FileWriter("test3.txt");
            BufferedWriter bw = new BufferedWriter(fw);

            //문자하나 출력
            bw.write('A');
            char[] buf = {'B','C','D'};
            //문자 배열 출력
            bw.write(buf);
            //문자 배열 off부터 len개수만큼 출력
            bw.write(buf,1,2);
            //문자열 ㅜㅊㄹ력
            bw.write("저는 홍길동입니다.");

            bw.flush();
            bw.close();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }



    }
}
