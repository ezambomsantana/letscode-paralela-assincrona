package com.letscode.future;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.stream.IntStream;

public class Main {

    public static void main(String [] args) throws ExecutionException, InterruptedException {
        ExecutorService threadpool = Executors.newCachedThreadPool();
        Future<Integer> futureTask = threadpool.submit(() -> soma(1000));

        while (!futureTask.isDone()) {
            System.out.println("FutureTask is not finished yet...");
        }
        var result = futureTask.get();
        System.out.println(result);

        threadpool.shutdown();
    }

    public static Integer soma(Integer numero) {
        Integer soma = IntStream
                .range(0, numero)
                .sum();
        return soma;
    }

}
