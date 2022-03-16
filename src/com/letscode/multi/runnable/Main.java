package com.letscode.multi.runnable;

public class Main {

    public static void main(String[] args) throws InterruptedException {


        Conta conta = new Conta(100);
        Thread thread = new Thread(conta);
        thread.start();


        System.out.println(thread.isAlive());
        System.out.println(thread.isAlive());
        thread.join();
        System.out.println(thread.isAlive());
    }
}
