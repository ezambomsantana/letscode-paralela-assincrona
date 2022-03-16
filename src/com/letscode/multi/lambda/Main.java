package com.letscode.multi.lambda;

import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        Thread thread = new Thread(() -> soma(100));
        thread.start();
    }

    public static void soma(Integer numero) {
        Integer soma = IntStream
                .range(0, numero)
                .sum();
        System.out.println(soma);
    }

}
