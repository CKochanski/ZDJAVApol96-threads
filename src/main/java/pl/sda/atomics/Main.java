package pl.sda.atomics;

import pl.sda.synchronization.Counter;

import java.util.concurrent.atomic.AtomicInteger;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        AtomicInteger counter = new AtomicInteger();
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                counter.getAndIncrement();
            }
        });
        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                counter.getAndIncrement();
            }
        });

        thread1.start();
        thread2.start();

        thread1.join(); //operacja join czeka na skonczenie wszystkich watkow
        thread2.join();
        System.out.println(counter.get());
    }
}
