package pl.sda.executorservice.exercise;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        Future<?> submit = executorService.submit(new Run());
        executorService.submit(new Call());
        executorService.shutdown();
    }
}
