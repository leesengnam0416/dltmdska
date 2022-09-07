package chapter16;

public class Thread6 {
    public static void main(String[]args){

        Sum t1 = new Sum();
        Sum t2 = new Sum();

        t1.start();
        t2.start();
        try{
            t1.join(); // t1스레드가 종료될때까지 대기
            t2.join(); // t2스레드가 종료될때까지 대기
        } catch (InterruptedException e){

        }
        System.out.println("두 스레드의 Sum 합계 = "+(t1.sum+t2.sum));


    }
}

class Sum extends Thread{
    int sum = 0;

    @Override
    public void run() {
        for (int i=0; i<=100; i++){
            sum += i;
        }
    }
}
