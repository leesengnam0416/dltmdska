package chapter12;

public class ShapeCircle extends Shape {

    //필드
    double r;

    //생성자
    ShapeCircle(){
        this (1);
    }
    ShapeCircle (double r){
        this.r = r;
    }

    // 메서드 재정의 오버라이딩

    @Override
    double area() {
        return (r*r) * Math.PI;
    }

    @Override
    double length() {
        return (r*2)*Math.PI;
    }
}
