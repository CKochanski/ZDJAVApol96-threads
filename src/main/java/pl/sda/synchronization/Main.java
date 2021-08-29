package pl.sda.synchronization;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        final Counter counter = new Counter();
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                counter.increment();
            }
        });
        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                counter.increment();
            }
        });

        thread1.start();
        thread2.start();

        thread1.join(); //operacja join czeka na skonczenie wszystkich watkow
        thread2.join();
        System.out.println(counter.getValue());
    }
}
