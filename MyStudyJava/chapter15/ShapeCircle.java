package chapter15;

public class ShapeCircle extends Shape{

    //필드
    double r;

    //생성자
    ShapeCircle(){
        this(1);
    }
    ShapeCircle(double r){
        this.r=r;
    }

    @Override
    double area() {
        return (r*r)*Math.PI;
    }

    @Override
    double length() {
        return (r * 2) * Math.PI;
    }

    @Override
    public String toString() {
        return "넓이 : "+this.area();
    }
}
