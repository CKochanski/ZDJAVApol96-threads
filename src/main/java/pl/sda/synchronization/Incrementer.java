package pl.sda.synchronization;

public class Incrementer implements Runnable {

    private Pair pair;

    public Incrementer(Pair pair) {
        this.pair = pair;

    }

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            pair.incrementKey();
            pair.incrementValue();
        }


    }
}
