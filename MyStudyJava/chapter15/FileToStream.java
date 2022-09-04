package chapter15;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileToStream {
    public static void main(String[]args){

        try{
            // Paths.get 메서드 사용
            Path path = Paths.get("src/chapter15/StrToStream.java");
            Stream<String> stream =
                    Files.lines(path, Charset.defaultCharset());
            stream.forEach(s -> System.out.println(s));
            stream.close();
            System.out.println();

            // BufferedReader 의 lines 메소드 사용
            File file = path.toFile();
            FileReader tr = new FileReader(file);
            BufferedReader br = new BufferedReader(tr);
            br.lines().forEach(s-> System.out.println(s));
            stream.close();
        } catch (Exception e){
            System.out.println(e.getMessage());
        }




    }
}
