package pl.sda.waiting.exercise;

public class Receiver implements Runnable {
    private Data data;

    public Receiver(Data data) {
        this.data = data;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                data.receiveData();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
