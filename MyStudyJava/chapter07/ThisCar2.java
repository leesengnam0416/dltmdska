package chapter07;

public class ThisCar2 {
    // 필드
    String color;
    String company;
    String type;

    ThisCar2(){
        this("white","기아","경차");
    }

    ThisCar2 (String color, String company, String type){
        this.color = color;
        this.company = company;
        this.type = type;
    }

    ThisCar2(String com, String t){
        this("white",com,t);
    }
    ThisCar2(String t){
        this("white","기아","t");
    }
    public String toString(){
        return color + "-" + company + "-" + type;
    }
}
