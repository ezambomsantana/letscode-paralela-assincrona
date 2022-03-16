package com.letscode.multi.runnable;

import java.util.stream.IntStream;

public class Conta implements Runnable {

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
