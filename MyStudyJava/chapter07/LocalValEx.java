package chapter07;

public class LocalValEx {
    public static void main(String[]args){
        Local local = new Local();

        System.out.println(local.name); // null

        local.process();
        System.out.println(local.name); // 홍길동

        local.printAge1();
        local.printage2();

        // for 문 불록 내에서의 변수 선언
        for (int i=0; i<10; i++){
            int temp = 0;
            temp += i;
        System.out.println(temp); // 에러
        }

    }
}
