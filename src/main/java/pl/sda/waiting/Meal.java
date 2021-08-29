package pl.sda.waiting;

public class Meal {

    private boolean isReady = false;

    public synchronized void waitForMeal() throws InterruptedException {
        while (!isReady) {
            System.out.println("Waiting for meal");
            wait();
        }
        System.out.println("Meal is ready!!!");
    }

    public synchronized void prepare() {
        System.out.println("Prepare meal");
        isReady = true;
        notifyAll();
    }
}
