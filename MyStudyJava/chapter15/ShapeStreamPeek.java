package chapter15;

import java.util.Arrays;
import java.util.List;

public class ShapeStreamPeek {
    public static void main(String[]args){

        Shape s1 = new ShapeRectangle(10,3);
        Shape s2 = new ShapeCircle(10);
        Shape s3 = new ShapeRectangle(20,2);
        Shape s4 = new ShapeCircle(11);

        List<Shape> list = Arrays.asList(s1,s2,s3,s4);

//        list.parallelStream().mapToDouble(a->a.area())
//                .peek(a -> System.out.println(a)).sum();

        boolean result = list.stream().allMatch(a->(a instanceof Shape));
        System.out.println("모든 요소는 Shape의 객체이다. ->"+result);

        //요소들 중 하나이상이 Rectangle 객체 인지 조건 비교
        boolean result2 = list.stream().anyMatch(a->(a instanceof ShapeRectangle));
        System.out.println("요소 중 Rectangle의 객체가 존재한다. ->"+result2);

        //모든 요소가 Circle의 객체인지 조건에 해당하지 않는지 비교
        boolean result3 = list.stream().noneMatch(a->(a instanceof ShapeCircle));
        System.out.println("모든 요소 중 Circle의 객체가 존재하지 않는다. ->"+result3);

    }
}
