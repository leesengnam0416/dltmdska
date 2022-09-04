package chapter11;

public class ClassEx {
    public static void main(String[]args){

        ClassExEnvEx env = new ClassExEnvEx();

        // 객체를 이용해서 생성
        Class c1 = env.getClass();
        System.out.println(c1.getName());

        // 문자열 주소로 생성
        try {
            Class c2 = Class.forName("chapter11.PropertyEx");
            System.out.println(c2.getName());
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
