package chapter16;

public class Thread5 {
    public static void main(String[]args){

        Thread t1 =new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=0; i<10; i++){
                    System.out.println("t1 :"+i);
                    try{
                        Thread.sleep(1000);
                    }catch (InterruptedException e){
                    }
                        System.out.println("스레드 실행 종료");
                }
            }
        });
        t1.start();


    }
}
