package chapter16;

public class ThreadEx {
    public static void main(String[]args){

        //Thread 상속받는 방법
        ThreadExtend t1 = new ThreadExtend();

        // Rannable 상속받는 방법
        RunnableImple r = new RunnableImple();
        Thread t2 = new Thread(r);


        t1.start();
        t2.start();

    }
}

class ThreadExtend extends Thread {
    public void run(){
        System.out.println("Thread 상속 받는 방법");
        for (int i=0; i<50; i++){
            System.out.println("ThreadExtend:"+i);
        }
    }
}

class RunnableImple implements Runnable{
    public void run(){
        System.out.println("Runnable 구현하는 방법");
        for (int i=0; i<50; i++){
            System.out.println("Runnable:"+i);
        }
    }
}