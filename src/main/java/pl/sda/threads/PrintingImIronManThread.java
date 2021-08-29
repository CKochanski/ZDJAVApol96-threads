package pl.sda.threads;

public class PrintingImIronManThread extends Thread {

    @Override
    public void run() {
        System.out.println("I am Iron man from thread " + Thread.currentThread().getId());
    }
}
