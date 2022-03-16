package com.letscode.completablefuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

public class Main {

    public static void main(String [] args) throws ExecutionException, InterruptedException {
        CompletableFuture<Integer> completableFuture = CompletableFuture.supplyAsync(() -> soma(1000));
        while (!completableFuture.isDone()) {
            System.out.println("CompletableFuture is not finished yet...");
        }

        completableFuture.cancel(true);
        Integer result = completableFuture.get();
        System.out.println(result);
    }

    public static Integer soma(Integer numero) {
        Integer soma = IntStream
                .range(0, numero)
                .map(x -> x * 2)
                .sum();
        return soma;
    }
}
