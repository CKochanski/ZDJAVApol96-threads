package pl.sda.executorservice.exercise;

import java.util.concurrent.Callable;

public class Call implements Callable<String> {
    @Override
    public String call() throws Exception {
        System.out.println("calling Hello");
        return null;
    }
}
