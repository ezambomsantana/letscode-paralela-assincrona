package com.letscode.multi.thread;

public class Main {

    public static void main(String[] args) {

	    Conta conta = new Conta(100);
        conta.start();

        conta = new Conta(1000);
        conta.start();
    }
}
