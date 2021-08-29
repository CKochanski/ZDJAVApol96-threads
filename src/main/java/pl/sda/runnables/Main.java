package pl.sda.runnables;


public class Main {

    public static void main(String[] args) {
        System.out.println("I am Iron man from main class " + Thread.currentThread().getId());
        PrintingImIronManRunnable runnable = new PrintingImIronManRunnable();
        new Thread(runnable).start();
    }
}
