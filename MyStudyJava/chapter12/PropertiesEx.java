package chapter12;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesEx {
    public static void main(String[]args) {
        try {
            Properties pr = new Properties();

            // properties 파일 읽어오기
            FileInputStream reder = new FileInputStream(
                    "C:\\Users\\A\\IdeaProjects\\LeeSeungNam_study\\src\\chapter12\\config.properties"
            );

            // Properties 객체에 로드
            pr.load(reder);
            System.out.println(pr);
            System.out.println("이름 :" + pr.get("name"));

            // property에 키,값 으로 추가
            pr.put("subject", "자바");
            System.out.println(pr);

            // properties 파일로 출력
            pr.store(new FileOutputStream("C:\\Users\\A\\IdeaProjects\\LeeSeungNam_study\\src\\chapter12\\test.properties"),"#save");

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
