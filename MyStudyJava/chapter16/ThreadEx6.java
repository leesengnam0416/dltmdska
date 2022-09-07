package chapter16;

public class ThreadEx6 {
    public static void main(String[]args){

        YieldThread t1 = new YieldThread();
        YieldThread t2 = new YieldThread();

        t1.start();
        t2.start();
        try{
            Thread.sleep(1000);
        }catch(Exception e){

        }
        t1.isContinue = false; // t1양보
        try{
            Thread.sleep(1000);
        }catch (Exception e){

        }
        t1.isContinue = true; // t1 다시 실행

        try {
            Thread.sleep(2000);
        }catch (Exception e){

        }

        // Thread 종료
        t1.isBreak = true;
        t2.isBreak = true;
    }
}

class YieldThread extends Thread{
    boolean isBreak = false;
    boolean isContinue = true;

    @Override
    public void run() {
        while (!isBreak){
            if (isContinue){
                System.out.println(getName()+"실행 중");
            }
            else {
                System.out.println(getName()+"종 료");
            }
        }
    }
}