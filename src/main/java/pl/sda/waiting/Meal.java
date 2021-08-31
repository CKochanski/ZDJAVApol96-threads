package pl.sda.waiting;

public class Meal {

    private boolean isReady = false;

    public synchronized void waitForMeal() throws InterruptedException {
        while (!isReady) {
            System.out.println("Waiting for meal");
            wait();
            System.out.println("I received notification about meal");
        }
        System.out.println("I am eating now!");
    }

    public synchronized void prepare() {
        System.out.println("Prepare meal");
        isReady = true;
        notifyAll();
    }
}
