package pl.sda.callables;

import java.util.concurrent.Callable;

public class HelloReturnerCallable implements Callable<String> {

    @Override
    public String call() throws Exception {
        return "Hello";
    }
}
