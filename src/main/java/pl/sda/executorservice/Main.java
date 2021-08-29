package pl.sda.executorservice;

import pl.sda.runnables.PrintingImIronManRunnable;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.submit(new PrintingImIronManRunnable());
        executorService.shutdown();
    }
}
