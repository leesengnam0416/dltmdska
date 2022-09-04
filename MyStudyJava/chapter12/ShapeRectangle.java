package chapter12;

public class ShapeRectangle extends Shape{
    // 필드
    int w,h;

    //생성자
    ShapeRectangle(){
        this(1,1);
    }
    ShapeRectangle(int w,int h){
        this.w=w;
        this.h=h;
    }

    @Override
    double area() {
        return (w*h);
    }

    @Override
    double length() {
        return (w+h)*2 ;
    }


}
