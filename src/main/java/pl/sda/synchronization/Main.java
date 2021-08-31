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

        Pair pair1 = new Pair();

        Thread thread3 = new Thread(new Incrementer(pair1));
        Thread thread4 = new Thread(new Incrementer(pair1));
        thread3.start();
        thread4.start();

        thread3.join();
        thread4.join();
        System.out.println("Klucz = " + pair1.getKey()+" Wartość = "+ pair1.getValue());

    }
}
