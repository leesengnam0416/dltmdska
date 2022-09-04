package chapter15;

public class ShapeRectangle extends Shape{

    //필드
    int w,h;

    //생성자
    ShapeRectangle(){
        this (1,1);
    }
    ShapeRectangle(int w, int h){
        this.w=w;
        this.h=h;
    }

    // 메서드 재정의 오버라이딩


    @Override
    double area() {
        return (w*h);
    }

    @Override
    double length() {
        return (w+h)*2;
    }

    @Override
    public String toString(){
        return "넓이: " +this.area();
    }
}
