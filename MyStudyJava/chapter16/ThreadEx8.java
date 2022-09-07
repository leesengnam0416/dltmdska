package chapter16;

import chapter09.A;

public class ThreadEx8 {
    public static void main(String[]args){

        // 통장 객체 생성
        Account acc = new Account();

        // 부모 스레드 객체 생성
        Parent p =new Parent(acc);

        // 자식 스레드 객체 생성
        Child c = new Child(acc);

        p.start();
        c.start();

        try {
            Thread.sleep(5000);
        }catch (InterruptedException e){

        }
        // 스레드 중지
        c.interrupt();
        p.interrupt();


    }
}

// 통장 클래스
class Account{
    int money;
    //출금
    synchronized void withdraw(){
        while (money == 0){
            try {
                wait();
            }catch (InterruptedException e){
                break;
            }
        }
        notifyAll();
        System.out.println(Thread.currentThread().getName()+money+"원 출금");
        money = 0;
    }
    // 입금
    synchronized void deposit(){
        while (money >0){
            try {
                wait();
            }catch (InterruptedException e){
                break;
            }
        }
        //랜덤 입금 10~50만원
        System.out.println();
        money = (int)((Math.random()*5)+1)*100000;
        System.out.println(Thread.currentThread().getName()+money+"원 입금");
        notifyAll();
    }
}

// 부모 스레드
class Parent extends Thread {
    Account account;

    Parent(Account account){
        super("부모");
        this.account = account;
    }

    @Override
    public void run() {
        while (true){
            try {
                account.deposit();
                sleep((int)(Math.random()*2000));
            }catch (InterruptedException e){
                break;
            }
        }
    }
}

// 자식 스레드
class Child extends Thread{
    Account account;

    Child(Account account){
        super("자식");
        this.account = account;
    }

    @Override
    public void run() {
        while (true){
            try {
                if (account.money > 0){
                    account.withdraw();
                }
                sleep((int)(Math.random()*500));
            }catch (InterruptedException e){
                break;
            }
        }
    }
}