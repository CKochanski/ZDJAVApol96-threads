package pl.sda.runnables;

public class PrintingImIronManRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("I am Iron man from runnable " + Thread.currentThread().getId());
    }
}
