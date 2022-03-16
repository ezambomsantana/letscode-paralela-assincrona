package com.letscode.multi.thread;

import java.util.stream.IntStream;

public class Conta extends Thread {

    private Integer numero;

    public Conta(Integer numero) {
        this.numero = numero;
    }

    public void run() {
        Integer soma = IntStream
                .range(0, this.numero)
                .sum();
        System.out.println(soma);
    }

}
