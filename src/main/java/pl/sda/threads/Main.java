package pl.sda.threads;

public class Main {

    public static void main(String[] args) {
        System.out.println("I am Iron man from main class " + Thread.currentThread().getId());
        PrintingImIronManThread thread = new PrintingImIronManThread();
        thread.start();
    }
}
