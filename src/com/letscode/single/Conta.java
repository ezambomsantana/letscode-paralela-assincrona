package com.letscode.single;

import java.util.stream.IntStream;

public class Conta {

    private Integer numero;

    public Conta(Integer numero) {
        this.numero = numero;
    }

    public void soma() {
        Integer soma = IntStream
                .range(0, this.numero)
                .sum();
        System.out.println(soma);
    }

}
